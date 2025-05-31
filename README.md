# pizzaria

## Plano Inicial
### Plano de Produção
Criar uma API que retorne o plano de de produção aonde o dono do estabelecimento possa:
- Deve ser possivel cadastrar um estoque de materiais. Ex.: 500Kg de Farinha, 200kg de Calabresa, 30 Peças de Mussarela;
- Deve gerar um plano de produção que peça uma lista de pizzas (Calabresa, catupiry, etc.) e retorne, baseado no estoque, a quantidade possivel;
- Deve ter esquema de Autenticação e Autorização via Token JWT
- Deve ter uma boa cobertura de testes automatizados
- Deve seguir os padrões de Clean Code e DDD

### Endpoints
- POST /login
- GET  /pizza/ - Retorna todas as pizzas cadastradas
- POST /pizza/ - Cadastra uma pizza
- GET  /pizza/{id_pizza} - retorna uma pizza especifica através do ID
- GET  /stock/ - Retorna todos os ingredientes cadastrados com suas respectivas propriedades
- GET  /stock/ingredient/{id_ingredient} - retorna um ingrediente especifico
- POST /stock/ingredient - cadastra um ingrediente


