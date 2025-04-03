# Java 17 JRE 기반의 경량 이미지 사용
FROM eclipse-temurin:17-jre-alpine

# 빌드된 JAR 파일을 이미지에 복사
COPY build/libs/safelight-0.0.1-SNAPSHOT.jar app.jar

# JAR 파일 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]