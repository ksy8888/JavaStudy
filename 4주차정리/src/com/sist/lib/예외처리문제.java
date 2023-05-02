package com.sist.lib;
/*
  
  문제 1

예외에 대한 설명 중 틀린 것은 무엇입니까?

① 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.

② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 
   체크하지 않는다.

③ 예외는 try-catch 블록을 사용해서 처리된다.

④ 자바 표준 예외만 프로그램에서 처리할 수 있다. (답)


문제 2

try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?

① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
------------- 

② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.

③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다. (답)
			==> finally는 무조건 수행하는 문장

④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.


문제 3

throws에 대한 설명으로 틀린 것은 무엇입니까?

① 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.

② throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.

③ 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성 할 수 있다.

④ 새로운 예외를 발생시키기 위해 사용된다. ==> throw (답) 


문제 4

4. throw에 대한 설명으로 틀린 것은 무엇입니까?
   -----임의발생
① 예외를 최초로 발생시키는 코드이다.
② 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.==> throws (답) 
③ throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
④ throw 키워드 뒤에는 예외 객체 생성 코드가 온다.
	throw new 새로운예외처리클래스()
	
문제 5

다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?

public void method1() throws NumberFormauException, ClassNotFoundException { ... }

① try{ method1(); } catch (Exception e) { }
② void method2() throws Exception { method1();  }
③ try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { } (답)
상속 크기가 큰 메소드가 아래로 와야함
>> try{ method1(); } catch (ClassNotFoundException e) { } catch (Exception e) { } 

④ try{ method1(); } catch (ClassNotFoundException e) { } catch (NumberFormauException e) { }


문제 6

다음 코드가 실행되었을 때 출력 결과는 무엇입니까?
public class TryCatchFinallyExample {
	public static void main(String[] args){
    	String[] strArray = { "10" , "2a" };
        int value = 0;							//value=10 변경된 값을 유지한다
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]);
            } catch(ArrayIndexOutOfBoundException e){
            	System.out.println("인덱스를 초과했음");
            } catch(NumberFormatException e) {
            	System.out.println("숫자로 변환할 수 없음");
            } finally {
            	System.out.println(value);	==> finally는 무조건 수행
            }
        }
    }
}
(답) 10  
	숫자로 변환할 수 없음
	10	
	인덱스를 초과했음
	10

 */
public class 예외처리문제 {
	
	public static void main(String[] args) {
		
		// => 크롤링 => try를 for문 안쪽에 배치
		try {
			for(int i=1; i<=3; i++) {
				if(i==2) {
					System.out.println(i/0);			
				}
				System.out.println("i="+i);
			}
			
		} catch(Exception e) {
			System.out.println("예외발생");
		}
		

		System.out.println();
	/////////////////////////////////////////////	
		
		for(int i=1; i<=3; i++) {
			try {
				if(i==2) {
					System.out.println(i/0);
				}
				System.out.println("i="+i);
			} catch(Exception e) {
				System.out.println("예외발생");
			}
		}

	}
	
}
