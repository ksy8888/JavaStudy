package com.sist.main;

import java.io.FileReader;

/*
 		1|
 		쇼생크 탈출|
 		드라마|
 		https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 		팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 		2016 .02.24 재개봉, 1995 .01.28 개봉|
 		15세 관람가|
 		프랭크 다라본트
 */
class Movie {
	String no;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}

class MovieSystem {
	Movie[] movies = new Movie[1938];
	
	MovieSystem() {
		// TODO Auto-generated constructor stub
		String data = "";
		StringBuffer sb = new StringBuffer();	//////////최적화
		try {
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i=0;
			while ((i=fr.read()) != -1) 	//한글자씩 읽어옴 int형으로
			{
				data = String.valueOf((char)i);		//////////
				sb.append(data);
			}
			fr.close();
			System.out.println(sb.toString());	/////////////
		} catch(Exception ex) {}
		
		String msg = sb.toString();
		int i=0;
		String[] movie = msg.split("\n");
		for(String m:movie)
		{
			String[] ss = m.split("\\|");
			movies[i] = new Movie();
			movies[i].no = ss[0];
			movies[i].title = ss[1];
			movies[i].genre = ss[2];
			movies[i].poster = ss[3];
			movies[i].actor = ss[4];
			movies[i].regdate = ss[5];
			movies[i].grade = ss[6];
			movies[i].director = ss[7];
			i++;
		}
	}
	
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieSystem ms = new MovieSystem();
		for(Movie m:ms.movies)
		{
			System.out.println(m.title);
		}
	}

}
