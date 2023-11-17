-- 모든 레코드 조회하기
SELECT * FROM ANIMAL_INS ORDER BY ANIMAL_ID

-- 역순 정렬하기
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC

-- 아픈 동물 찾기
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID

-- '%수빈'이면 수빈으로 끝나는 데이터를 찾고 '수빈%'이면 수빈으로 시작하는 데이터를 찾음.

-- 어린 동물 찾기
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID

-- 이름이 없는 동물의 아이디
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NULL

-- 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID

-- 여러 기준으로 정렬하기
-- DATETIME DESC, 보호를 나중에 시작한 개를 먼저 조회
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC

-- 상위 n개 레코드
SELECT NAME FROM ANIMAL_INS
ORDER BY DATETIME LIMIT 1

-- 이름 있는 동물의 아이디
SELECT ANIMAL_ID FROM ANIMAL_INS
WHERE NAME IS NOT NULL ORDER BY ANIMAL_ID

-- 최댓값 구하기
SELECT MAX(DATETIME) FROM ANIMAL_INS

-- 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS FROM FOOD_FACTORY
WHERE ADDRESS LIKE "강원도%"

-- 경기도에 위치한 식품창고 목록 출력하기
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,
       IF(FREEZER_YN IS NULL OR FREEZER_YN = 'N', 'N', 'Y') FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID

-- 나이 정보가 없는 회원 수 구하기
SELECT COUNT(USER_ID) FROM USER_INFO WHERE AGE IS NULL

-- 조건에 맞는 회원 수 구하기
SELECT COUNT(USER_ID) FROM USER_INFO
WHERE AGE >= 20 and AGE <=29 and YEAR(JOINED) = '2021'

-- 가장 비싼 상품 구하기
SELECT MAX(PRICE) AS MAX_PRICE FROM PRODUCT

-- 12세 이하인 여자 환자 목록 출력하기
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IF(TLNO IS NULL, 'NONE', TLNO) FROM PATIENT
WHERE AGE <= 12 and GEND_CD = "W"
ORDER BY AGE DESC, PT_NAME ASC

-- 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT DR_NAME, DR_ID, MCDP_CD,
       DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME ASC

-- 인기있는 아이스크림
SELECT FLAVOR FROM FIRST_HALF ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID

-- 과일로 만든 아이스크림 고르기부터
SELECT H.FLAVOR
FROM FIRST_HALF AS H JOIN ICECREAM_INFO AS I on I.FLAVOR = H.FLAVOR
WHERE I.INGREDIENT_TYPE = 'fruit_based' and H.TOTAL_ORDER > 3000

--  조건에 맞는 도서 리스트 출력하기
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") FROM BOOK
WHERE CATEGORY = '인문' and YEAR(PUBLISHED_DATE) = '2021'
ORDER BY PUBLISHED_DATE

-- 평균 일일 대여 요금 구하기
SELECT ROUND(AVG(DAILY_FEE))
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'

-- 자동차 대여 기록에서 장기/단기 대여 구분하기
SELECT HISTORY_ID, CAR_ID,
       DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE,
       DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
       IF(DATEDIFF(END_DATE, START_DATE) + 1 >= 30, '장기 대여','단기 대여') AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE DATE_FORMAT(START_DATE, '%Y-%m') = '2022-09'
ORDER BY HISTORY_ID DESC

-- 특정 옵션이 포함된 자동차 리스트 구하기
SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%네비게이션%'
ORDER BY CAR_ID DESC

-- 조건에 부합하는 중고거래 댓글 조회하기
SELECT B.TITLE, B.BOARD_ID,
       R.REPLY_ID, R.WRITER_ID, R.CONTENTS,
       DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD AS B
         JOIN USED_GOODS_REPLY AS R ON B.BOARD_ID = R.BOARD_ID
WHERE DATE_FORMAT(B.CREATED_DATE,'%Y-%m') = '2022-10'
ORDER BY R.CREATED_DATE, B.TITLE