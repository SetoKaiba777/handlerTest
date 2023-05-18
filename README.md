# Handle Test API

## Objetivo

Essa Api foi criada para testar a funcionalidade de interceptação de Requests do Spring MVC. 


## Funcionamento

Para cumprir o objetivo criei uma controller com dois endpoints,

1. <http://localhost:8080/hi>

2. <http://localhost:8080/hello>

onde apenas o endpoint **1** é interceptado, conforme pode-se verificar na classe **InterceptorConfig**.

Após a execução do endpoint **1**, o usuário poderá ver nos logs da aplicação, a execução da lógica contida na classe 
**HandlerInterceptorClass**.