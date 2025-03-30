# SafeLight-Server


Safelight-Server는 시각장애인의 안전한 보행을 지원하기 위한 보행보조 애플리케이션 "SafeLight"의 백엔드 서버입니다.

주요 기능

각 건물의 출입구 및 접근성 정보 제공

사용자 회원가입 및 인증 관리

사용자 정보 및 설정 관리

출입구 및 경로 데이터 관리

기술 스택

Framework: Spring Boot

Database: MySQL

API: RESTful API

Authentication: JWT 기반 인증

API 구성

사용자 관리

회원가입, 로그인, 사용자 프로필 관리 등

건물 및 출입구 정보

건물 목록 조회, 출입구 세부 정보 조회 및 수정 등

설치 및 실행

요구 사항

Java 17+

MySQL

실행 방법

git clone https://github.com/glone0506/SafeLight-Server.git
cd SafeLight-Server

# application.properties 설정 후 실행
./gradlew bootRun

기여 방법

프로젝트에 기여하고자 하시면 Pull Request를 보내주세요.

라이선스

본 프로젝트는 MIT 라이선스를 따릅니다.