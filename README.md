# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현 기능 목록
* 정답 생성
  * 3 자리 숫자, 각 자리 수는 1 ~ 9 중 1가지이며 서로 다른 수로 구성
* 게임 진행
  * 사용자 숫자 입력
  * 사용자 입력 값 오류 확인
    * 잘못된 수인 경우 IllegalArgumentException 발생 후 어플리케이션 종료
    * 숫자가 아닌 경우 오류 발생
    * 사용자가 입력한 숫자가 컴퓨터가 생성한 숫자와 자리수가 다른 경우 오류 발생
  * 사용자 입력 값 검증
    * 일치하는 값이 없는 경우 : 낫싱 출력
    * 일부 일치하는 값이 있는 경우 : 스트라이크 및 볼 출력
    * 모든 값이 일치하는 경우 : 3스트라이크 출력
      * '3개의 숫자를 모두 맞히셨습니다! 게임 종료' 메시지 출력 후 현재 진행중인 게임 종료
* 게임 완료
  * 1 입력 시 게임 재시작
  * 2 입력 시 게임 종료

## 구현 클래스 목록
* 도메인
  * 컴퓨터
    * 정답을 생성하여 보관하는 역할
  * 사용자
    * 정답을 입력받아 보관하는 역할
  * 심판
    * 컴퓨터와 사용자의 답을 비교하는 역할
* 컨트롤러
  * 게임 컨트롤러
    * 사용자와 컴퓨터 둘 간의 게임 진행 담당