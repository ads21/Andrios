# Andrios

Software responsável pelo gerenciamento e divulgação de venda de ingressos( shows, eventos em geral), tornando facil e organizada as transações feitas em lojas que vendem ingreços de shows e outros tipos de eventos. Além de ser um software gratuito, o Andrios impulssiona novos desenvolvedores a aprender tecnologias mais usadas no mercado, sendo assim impussionando ao novo desenvolvedor entrar com uma bagagem no mercado.

### Configuração do Git

#### Configurações iniciais

Faça o download do Git [here](http://git-scm.com/downloads)
dependendo do tipo de sistema operacional

#### Configurações para uso do Git

After **General Configuration** section: 

1. Deverá ser criado um usuário e email na ferramenta.
```bash
$ git config --global user.name "John Doe"
```
```bash
$ git config --global user.email johndoe@example.com
```
2. Faça um clone do projeto a partir do seu repositório.
```bash
git clone git@github.com:seuUsuario/Andrios.git
```
3. Crie um novo "branch" diferente do branch "master"
```bash
git branch desenv
```
4. Após fazer algumas alterações no seu branch desenv, você precisa efetuar o commit destas.
```bash
git commit -am "Mensagem explicando o que foi feito nesta issue. issue number: #20"
```
**Ponto importante**: Antes de jogar suas alterações, você deverá atualizar seu repositório local com o repositório principal. Deverá ser feito um *fetch upstream*
```bash
git remote add upstream git@github.com:ads21/Andrios.git
```
E executar um pull
```bash
git fetch upstream
```
5. E finalmente deverá ser mesclado com o seu master local.
```bash
git checkout master
git merge upstream/master master
```
6. Neste ponto, já podemos fazer do nosso branch *desenv* para o nosso repositório pessoal
```bash
 git checkout desenv
  git rebase master
  git checkout master
  git merge desenv
  git push origin master
  #volta para o branch desenv e continua suas alterações :)
  git checkout desenv
```
7. Após estes passos você poderar submeter um *pull request* ao repositório principal.
