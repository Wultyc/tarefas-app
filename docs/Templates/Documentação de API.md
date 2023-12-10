# Finances API
API with logic to manage financial transactions made

# Source Code
Source Code Git Repository: http://example.com

## Endpoints
| Environment | Endpoint           |
| :---------: | ------------------ |
| Mock        | http://example.com |
| Dev         | https://finances-api.homalab-services-dev.homenetwork.jgabriel.eu |
| Prod        | https://finances-api.homalab-services-prd.homenetwork.jgabriel.eu |

## Interface
- [[04. API Endpoint Documentation|[GET]  /api/financial-transaction]]
- [[04. API Endpoint Documentation|[POST] /api/financial-transaction]]
- [[04. API Endpoint Documentation|[GET]  /api/financial-transaction/{transaction-id}]]
- 

## External Systems Integration
|  #  | System Name | Endpoint                                                                                                                         | Use Case                                  |
|:---:| ----------- | -------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------- |
|  1  | RabbitMQ    | (prod) rabbitmq.homalab-services-prd.homenetwork.jgabriel.eu<br/>(dev) rabbitmq.homalab-services-dev.homenetwork.jgabriel.eu     | Receive event from financial transactions |
|  2  | PostgreSQL  | (prod) postgresql.homalab-services-prd.homenetwork.jgabriel.eu<br/>(dev) postgresql.homalab-services-dev.homenetwork.jgabriel.eu | Store and read financial transactions     |

## API Manager Policies
|  #  | Policy | Configuration |
|:---:| ------ | ------------- |
| ... | ...    | ...           |

# Known Issues

| Status | Issue | Description | How to Fix |
| ------ | ----- | ----------- | ---------- |
|        |       |             |            |

# Change Log

| Update Date | App Version | API Spec Version | Comments  |
|:-----------:|:-----------:|:----------------:| --------- |
| YYYY-MM-DD  |    1.0.0    |      1.0.0       | A comment |
