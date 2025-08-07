# 💪 App de Academia — Planejamento de Sprints

## 👥 Integrantes  
- Arthur Bona  
- Lucas Miguel Vieira  
- João Vitor Monteiro

## 🛠 Tecnologias Utilizadas  
- *Front-end:* React Native  
- *Back-end:* Node.js com NestJS  
- *Banco de Dados:* PostgreSQL  
- *Autenticação:* Firebase Authentication  
- *Armazenamento de Mídia (imagens, vídeos de exercícios):* Firebase Storage  
- *Hospedagem da API:* Railway  
- *ORM:* Prisma  
- *Notificações Push:* Expo Notifications  
- *Controle de Versão:* Git + GitHub  
- *CI/CD:* GitHub Actions  

## 📱 Descrição do Projeto  
Este projeto é um aplicativo mobile de academia com foco em experiência do usuário, personalização de treinos e acompanhamento de progresso físico. Os usuários poderão:

- Realizar login por Google, Microsoft ou redes sociais via OAuth2  
- Montar treinos customizados com filtros por grupamento muscular, busca por exercícios e vídeos ilustrativos  
- Selecionar treinos prontos de um catálogo  
- Iniciar e registrar treinos realizados, com histórico detalhado  
- Acompanhar a evolução do peso por meio de gráficos interativos  
- Interagir com a comunidade por meio de um feed de publicações com imagens e textos  
- Receber notificações e acompanhar a própria performance

A aplicação segue um cronograma de 25 sprints, detalhadas abaixo, com foco em entregas incrementais, testes contínuos e deploys frequentes em ambiente de staging e produção.

## Time 👥  
- QA: Carla Souza 🕵️‍♀️  
- Dev Front-end: Ana Lima, Tiago Ribeiro, Maria 💻🎨  
- Dev Back-end: Bruno Rocha, Marina Duarte, João 🖥️🔧  
- DevOps: Felipe Mendes ⚙️🚀
---

## Sprints Detalhadas

### 🏋️‍♂️ Sprint 1: Infraestrutura inicial + Firebase Auth  
**Período total:** 01/07/2025 - 07/07/2025

- **Desenvolvimento (01/07 - 05/07)**  
  - Ana Lima (Front-end): Criou projeto React Native, integrou Firebase Auth (Google e Microsoft).  
  - Marina Duarte (Back-end): Implementou métodos NestJS para autenticarGoogle, autenticarMicrosoft e autenticarFormulario; modelagem do usuário com Prisma.  
  - Felipe Mendes (DevOps): Setup repositório GitHub com CI/CD GitHub Actions; configuração ambiente Render/Railway.

- **Testes/QA (06/07 - 07/07)**  
  - Carla Souza (QA): Testes manuais da autenticação e fluxo de login.

- **Revisão e Deploy (07/07)**  
  - Felipe Mendes: Deploy inicial em staging.

---

### 🏋️‍♂️ Sprint 2: Tela de Login e Cadastro (OAuth2)  
**Período total:** 08/07/2025 - 21/07/2025

- **Desenvolvimento (08/07 - 18/07)**  
  - Tiago Ribeiro (Front-end): Implementou telas de login com e-mail/senha, Google e Microsoft; validações e feedback.  
  - Bruno Rocha (Back-end): Ajustes backend para integração com Firebase Auth e logout.

- **Testes/QA (19/07 - 20/07)**  
  - Carla Souza: Testes de UI e fluxos de login/logout.

- **Revisão e Deploy (21/07)**  
  - Felipe Mendes: Deploy em staging.

---

### 🏋️‍♂️ Sprint 3: Gestão de Perfil de Usuário  
**Período total:** 22/07/2025 - 28/07/2025

- **Desenvolvimento (22/07 - 25/07)**  
  - Ana Lima (Front-end): Tela de edição de perfil, integração API.  
  - Marina Duarte (Back-end): Endpoints para cadastro e atualização de perfil.

- **Testes/QA (26/07 - 27/07)**  
  - Carla Souza: Testes de edição e consistência dos dados.

- **Revisão e Deploy (28/07)**  
  - Felipe Mendes: Deploy em staging.

---

### 🏋️‍♂️ Sprint 4: Estrutura do gráfico de controle de peso  
**Período total:** 29/07/2025 - 05/08/2025

- **Desenvolvimento (29/07 - 01/08)**  
  - Tiago Ribeiro (Front-end): Componente gráfico com dados mockados.  
  - Bruno Rocha (Back-end): Criou modelo Peso e endpoints adicionarPeso e listarPesos.

- **Testes/QA (02/08 - 04/08)**  
  - Carla Souza: Validação API e componentes gráficos.

- **Revisão e Deploy (05/08)**  
  - Felipe Mendes: Deploy em staging.

---

### 🏋️‍♂️ Sprint 5: Integração real do gráfico de peso  
**Período total:** 06/08/2025 - 12/08/2025

- **Desenvolvimento (06/08 - 10/08)**  
  - Ana Lima (Front-end): Integração real do gráfico; inputs para adicionar, editar e excluir peso.  
  - Marina Duarte (Back-end): Ajustes e validações.

- **Testes/QA (11/08 - 12/08)**  
  - Carla Souza: Testes funcionais.

- **Revisão e Deploy (12/08)**  
  - Felipe Mendes: Deploy em staging.

---

### 🏋️‍♂️ Sprint 6: Testes e refinamento  
**Período total:** 13/08/2025 - 19/08/2025

- **Desenvolvimento (13/08 - 17/08)**  
  - Tiago Ribeiro (Front-end): Ajustes UI baseados em feedback.  
  - Bruno Rocha (Back-end): Implementação testes unitários e integração.

- **Testes/QA (18/08 - 19/08)**  
  - Carla Souza: Testes manuais e automáticos.

- **Revisão e Deploy (19/08)**  
  - Felipe Mendes: Deploy em staging.

---

### 🏋️‍♂️ Sprint 7: Melhorias de UX e responsividade  
**Período total:** 20/08/2025 - 26/08/2025

- **Desenvolvimento (20/08 - 24/08)**  
  - Ana Lima (Front-end): Animações, responsividade e acessibilidade.  
  - Marina Duarte (Back-end): Ajustes para suportar front-end.

- **Testes/QA (25/08 - 26/08)**  
  - Carla Souza: Testes em dispositivos.

- **Revisão e Deploy (26/08)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 8: Deploy de produção + monitoramento  
**Período total:** 27/08/2025 - 02/09/2025

- **Desenvolvimento (27/08 - 30/08)**  
  - Bruno Rocha (Back-end): Preparação para produção, monitoramento.  
  - Felipe Mendes (DevOps): Configuração Sentry, LogRocket.

- **Testes/QA (31/08 - 01/09)**  
  - Carla Souza: Testes finais.

- **Revisão e Deploy (02/09)**  
  - Felipe Mendes: Deploy produção.

---

### 🏋️‍♂️ Sprint 9: Montar Treinos Customizados – Estrutura Inicial  
**Período total:** 03/09/2025 - 09/09/2025

- **Desenvolvimento (03/09 - 07/09)**  
  - Maria (Front-end): Tela montagem treino, integração inicial.  
  - João (Back-end): Modelagem TreinoCustomizado, endpoints CRUD.

- **Testes/QA (08/09 - 09/09)**  
  - — (sem QA formal)

- **Revisão (09/09)**

---

### 🏋️‍♂️ Sprint 10: Montar Treinos Customizados – Filtro por Grupamento Muscular  
**Período total:** 10/09/2025 - 16/09/2025

- **Desenvolvimento (10/09 - 14/09)**  
  - Maria (Front-end): Filtro por grupo muscular.  
  - João (Back-end): Atualização modelo e filtro API.

- **Testes/QA (15/09 - 16/09)**  
  - — (sem QA formal)

- **Revisão (16/09)**

---

### 🏋️‍♂️ Sprint 11: Montar Treinos Customizados – Barra de Pesquisa  
**Período total:** 17/09/2025 - 23/09/2025

- **Desenvolvimento (17/09 - 21/09)**  
  - Maria (Front-end): Pesquisa com debounce.  
  - João (Back-end): Endpoint busca exercícios.

- **Testes/QA (22/09 - 23/09)**  
  - — (sem QA formal)

- **Revisão (23/09)**

---

### 🏋️‍♂️ Sprint 12: Montar Treinos Customizados – Vídeo em Exercício  
**Período total:** 24/09/2025 - 30/09/2025

- **Desenvolvimento (24/09 - 28/09)**  
  - Maria (Front-end): Player de vídeo embutido.  
  - João (Back-end): Upload e armazenamento em Firebase Storage.

- **Testes/QA (29/09 - 30/09)**  
  - — (sem QA formal)

- **Revisão (30/09)**

---

### 🏋️‍♂️ Sprint 13: Selecionar Treinos Prontos – Estrutura e Catálogo  
**Período total:** 01/10/2025 - 07/10/2025

- **Desenvolvimento (01/10 - 05/10)**  
  - Maria (Front-end): Tela catálogo treinos.  
  - João (Back-end): Modelagem TreinoPronto, endpoint listagem.

- **Testes/QA (06/10 - 07/10)**  
  - — (sem QA formal)

- **Revisão (07/10)**

---

### 🏋️‍♂️ Sprint 14: Selecionar Treinos Prontos – Visualização e Importação  
**Período total:** 08/10/2025 - 14/10/2025

- **Desenvolvimento (08/10 - 12/10)**  
  - Maria (Front-end): Tela detalhes treino, botões importar e editar.  
  - João (Back-end): Integração montagem treino customizado.

- **Testes/QA (13/10 - 14/10)**  
  - — (sem QA formal)

- **Revisão (14/10)**

---

### 🏋️‍♂️ Sprint 15: Integração e Refinamento  
**Período total:** 15/10/2025 - 21/10/2025

- **Desenvolvimento (15/10 - 19/10)**  
  - Maria (Front-end): Ajustes UI, integração.  
  - João (Back-end): Correções API.

- **Testes/QA (20/10 - 21/10)**  
  - — (sem QA formal)

- **Revisão (21/10)**

---

### 🏋️‍♂️ Sprint 16: Histórico de Treinos  
**Período total:** 22/10/2025 - 28/10/2025

- **Desenvolvimento (22/10 - 26/10)**  
  - Tiago Ribeiro (Front-end): Tela histórico e detalhes.  
  - Bruno Rocha (Back-end): Modelagem TreinoRealizado, endpoints.

- **Testes/QA (27/10 - 28/10)**  
  - Carla Souza: Testes funcionais.

- **Revisão e Deploy (28/10)**  
  - Felipe Mendes: Deploy staging.

---

### 🏋️‍♂️ Sprint 17: Filtros e melhorias no Histórico  
**Período total:** 29/10/2025 - 04/11/2025

- **Desenvolvimento (29/10 - 02/11)**  
  - Ana Lima (Front-end): Filtros e melhorias visuais.  
  - Marina Duarte (Back-end): Otimizações.

- **Testes/QA (03/11 - 04/11)**  
  - Carla Souza: Testes manuais.

- **Revisão e Deploy (04/11)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 18: Feed de Publicações – Estrutura e Backend  
**Período total:** 05/11/2025 - 11/11/2025

- **Desenvolvimento (05/11 - 09/11)**  
  - Bruno Rocha (Back-end): Modelagem Post, endpoints, Firebase Storage.

- **Testes/QA (10/11 - 11/11)**  
  - Carla Souza: Testes backend.

- **Revisão (11/11)**

---

### 🏋️‍♂️ Sprint 19: Feed de Publicações – Interface e Integração  
**Período total:** 12/11/2025 - 18/11/2025

- **Desenvolvimento (12/11 - 16/11)**  
  - Ana Lima (Front-end): Tela feed, interações.  
  - Marina Duarte (Back-end): Integração API feed.

- **Testes/QA (17/11 - 18/11)**  
  - Carla Souza: Testes manuais.

- **Revisão e Deploy (18/11)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 20: Feed de Publicações – Finalização e UX  
**Período total:** 19/11/2025 - 25/11/2025

- **Desenvolvimento (19/11 - 23/11)**  
  - Tiago Ribeiro (Front-end): Animações e feedbacks.  
  - Bruno Rocha (Back-end): Preparação para comentários mock.

- **Testes/QA (24/11 - 25/11)**  
  - Carla Souza: Testes finais.

- **Revisão e Deploy (25/11)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 21: Iniciar um Treino – Preparação de Estrutura  
**Período total:** 26/11/2025 - 02/12/2025

- **Desenvolvimento (26/11 - 30/11)**  
  - Ana Lima (Front-end): Tela seleção treino.  
  - Marina Duarte (Back-end): Modelos Treino, Exercicio, endpoint listarTreinosDisponiveis.

- **Testes/QA (01/12 - 02/12)**  
  - Carla Souza: Testes manuais.

- **Revisão e Deploy (02/12)**  
  - Felipe Mendes: Deploy staging.

---

### 🏋️‍♂️ Sprint 22: Execução do Treino  
**Período total:** 03/12/2025 - 09/12/2025

- **Desenvolvimento (03/12 - 07/12)**  
  - Tiago Ribeiro (Front-end): Tela execução treino, timer, navegação.  
  - Bruno Rocha (Back-end): Endpoint iniciarTreino, registro parcial.

- **Testes/QA (08/12 - 09/12)**  
  - Carla Souza: Testes fluxo treino.

- **Revisão e Deploy (09/12)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 23: Finalização do Treino e Histórico  
**Período total:** 10/12/2025 - 16/12/2025

- **Desenvolvimento (10/12 - 14/12)**  
  - Ana Lima (Front-end): Tela resumo treino finalizado.  
  - Marina Duarte (Back-end): Endpoint finalizarTreino.

- **Testes/QA (15/12 - 16/12)**  
  - Carla Souza: Testes fluxos completos.

- **Revisão e Deploy (16/12)**  
  - Felipe Mendes: Deploy.

---

### 🏋️‍♂️ Sprint 24: Testes e Refinamento Geral  
**Período total:** 17/12/2025 - 23/12/2025

- **Desenvolvimento (17/12 - 21/12)**  
  - Tiago Ribeiro (Front-end): Refatorações, ajustes visuais.  
  - Bruno Rocha (Back-end): Testes unitários, correções.

- **Testes/QA (22/12 - 23/12)**  
  - Carla Souza: Testes finais.

- **Revisão e Deploy (23/12)**  
  - Felipe Mendes: Deploy final.

---

### 🏋️‍♂️ Sprint 25: Publicação e Monitoramento Final  
**Período total:** 24/12/2025 - 30/12/2025

- **Desenvolvimento (24/12 - 28/12)**  
  - Marina Duarte (Back-end): Preparação final para produção.  
  - Felipe Mendes (DevOps): Configuração monitoramento.

- **Testes/QA (29/12 - 30/12)**  
  - Carla Souza: Testes em dispositivos físicos e simuladores.

- **Revisão e Deploy (30/12)**  
  - Felipe Mendes: Deploy produção final.

---

## Vantagens e desvantagens de Metodologias Ágeis em projetos ⚡

    A metodologia ágil traz diversas vantagens para projetos de software. Ela permite entregas frequentes, 
    adaptação rápida a mudanças, maior colaboração entre equipe e cliente, e favorece a detecção precoce de problemas. 
    Esses ciclos curtos aumentam a visibilidade do progresso e ajudam a manter o foco no que realmente agrega valor.
    
    Por outro lado, sua implementação apresenta dificuldades. 
    No nosso caso, sentimos muita dificuldade em modularizar o que deve ser feito, ou seja, 
    quebrar tarefas grandes em partes menores e bem definidas, algo essencial para a metodologia ágil funcionar bem. 
    Além disso, há desafios comuns como a resistência à mudança, 
    a necessidade de disciplina nos rituais ágeis (como dailies e retrospectivas), 
    e a dependência de comunicação constante. 
    Também pode haver falta de documentação e dificuldade para estimar prazos com precisão.
