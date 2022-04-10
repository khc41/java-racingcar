# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## ToDo

- [x] Car
    - [x] int position
    - [x] boolean move()
    - [x] int getPosition()
- [x] InputView
    - [x] int inputCarCount()
    - [x] int inputCarMoveCount()
- [x] OutputView
    - [x] void outputMoveCar(Cars cars, int carMoveCount)

## ToDo - 문장

- 자동차
    - 자동차는 위치값을 갖는다.
    - 자동차는 랜덤한 값 결과에 따라 위치값이 이동될 수 있다.
- 입력
    - 자동차 개수를 입력받는다.
    - 자동차가 이동할 숫자를 입력받을 수 있다.
- 출력
    - 자동차 이동 결과를 출력한다.
        - 자동차 목록과 이동할 숫자를 인자로 받는다.
