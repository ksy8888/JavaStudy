package com.sist.dao;
import java.util.*;
import java.sql.*;
import java.io.*;

public class EmpDAO {
	//오라클 연결 객체 => Socket
	private Connection conn;
	// 오라클 송수신 (SQL전송(OutputStream) , 결과값 받기(BufferedReader))
	private PreparedStatement ps;
	private String driver,url,username, password;
	
	// 1. 드라이버 등록
	public EmpDAO() {
		
		//properties 읽기
		try {
			FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\OracleJoin\\src\\com\\sist\\dao\\db.properties");
			Properties prop = new Properties();
			prop.load(fr);
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			
			fr.close();
			
			Class.forName(driver);
			
		}catch(Exception ex) {}
		//드라이버 등록
	}
	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		}catch(Exception ex) {}
	}
	// 3. 오라클 해제
	public void disConnection() {
		try {
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception ex) {}
	}
	// 4. 오라클 통신 (기능) => JOIN => 목록
	/*
	 	EmpVO => 사원 1명에 대한 정보
	 	여러명일때 >> List<EmpVO>
	 */
	public List<EmpVO> empListData() {
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			//1. 연결
			getConnection();
			//2. SQL 문장
			String sql = "SELECT empno,ename,job,hiredate,sal,emp.deptno, "
						+ "dname,loc,grade "
						+ "FROM emp,dept,salgrade "
						+ "WHERE emp.deptno=dept.deptno "
						+ "AND sal BETWEEN losal AND hisal "
						+ "ORDER BY sal DESC";
		
			//3. SQL 문장 전송
			ps = conn.prepareStatement(sql);
			//4. 결과값 받기
			ResultSet rs = ps.executeQuery();
			//5. 결과값을 => list에 담는다
			while(rs.next()) {				
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				vo.setDeptno(rs.getInt(6));
				vo.getDvo().setDname(rs.getString(7)); //DeptVO >> dept
				vo.getDvo().setLoc(rs.getString(8));
				vo.getSvo().setGrade(rs.getInt(9)); //Svo >> salgraed
				list.add(vo);
				
			}
			rs.close();
		}catch(Exception ex) {
			//오류 확인
			ex.printStackTrace();
		} finally {
			//오라클 닫기
			disConnection();
		}
		return list;
	}
}
