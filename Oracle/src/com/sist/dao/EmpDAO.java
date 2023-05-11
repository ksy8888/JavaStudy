package com.sist.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private Connection conn;	//오라클 연결
	//===================> Socket
	private PreparedStatement ps; //송수신
	// ===========> BufferedReader / OutputStream
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//드라이버 설정
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception ex) {}
	}
	
	//연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
			//conn hr/happy
		} catch (Exception ex) {}
	}
	
	//연결해제
	public void disConnection() {
		try {
			if(ps!= null) 
				ps.close(); //in.close(), out.close()
			if(conn!=null)
				conn.close(); //s.close()
			//오라클 => 서버
		
		} catch (Exception ex) {}
	}
	
	//기능(SQL) => 송수신
	public List<EmpVO> empListData() {
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			
			//연결
			getConnection();
			//SQL문장 생성
			String sql = "SELECT empno,ename,job,sal "
						+ "FROM emp";
			
			//전송
			ps= conn.prepareStatement(sql);
			//결과값 받기
			ResultSet rs = ps.executeQuery(); //실행된 결과를 메모리에 저장
			// list에 값을 채운다
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setSal(rs.getInt(4));
				list.add(vo);
			}
			rs.close();
			
			
			
		} catch(Exception ex) {
			
		}finally {
			disConnection();
		}
		return list;
	}
}
