# starlucks

스타벅스 클론코딩을 목표로 진행하는 프로젝트입니다.

## Skills

<div>
<img src="https://img.shields.io/badge/Kotlin 1.8-7F52FF?style=flat&logo=Kotlin&logoColor=white"  alt=""/>
<img src="https://img.shields.io/badge/Spring Boot 3.1-6DB33F?style=flat&logo=springboot&logoColor=white"  alt=""/>
<img src="https://img.shields.io/badge/Spring Rest Docs-6DB33F?style=flat&logo=springboot&logoColor=white"  alt=""/>
</div>
<div>
<img src="https://img.shields.io/badge/Kotest-7F52FF?style=flat&logo=Kotlin&logoColor=white"  alt=""/>
<img src="https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white"  alt=""/>
</div>
<div>
<img src="https://img.shields.io/badge/MySQL 8-4479A1?style=flat&logo=mysql&logoColor=white"  alt=""/>	
<img src="https://img.shields.io/badge/Redis-DC382D?style=flat&logo=redis&logoColor=white"  alt=""/>

<img src="https://img.shields.io/badge/Docker-2496ED?style=flat&logo=docker&logoColor=white"  alt=""/>
</div>

## Business

| Lv1 | Lv2  | Lv3       |
|-----|------|-----------|
| 회원  | 회원관리 | 회원 가입     |
| 회원  | 회원관리 | 아이디 중복 확인 |
| 회원  | 회원관리 | 회원 로그인    |
| 회원  | 회원관리 | 회원 로그아웃   |
| 회원  | 회원관리 | 회원 탈퇴     |

## Trouble Shooting

- [Kotlin Entity All Open 이 동작하지 않는다.](https://github.com/JisuNa/TIL/blob/main/TroubleShooting/kotlin-entity-all-open.md)

## Getting Started

### 환경 세팅

docker-compose를 사용하여 필요한 환경 세팅합니다.

1. 필요한 docker-compose.yml 파일을 작성합니다.
```yaml
# docker-compose.yml
version: '3'
services:
  db:
    platform: linux/amd64
    container_name: mysql-8.0.33-test
    image: mysql:8.0.33
    restart: always
    ports:
      - 3306:3306
    environment:
      MYSQL_ROOT_PASSWORD: root
      TZ: Asia/Seoul
  redis:
    container_name: redis-7.0-test
    image: redis:7.0
    restart: always
    ports:
      - 6379:6379
```

2. docker-compose.yml 파일이 있는 디렉토리에서 아래 명령어를 실행합니다.
```shell
$ docker-compose up
```

## Convention

### Code Style

코드 스타일은 Ktlint를 사용합니다.

```shell
$ ./gradlew ktlintApplyToIdea
```
