![Static Badge](https://img.shields.io/badge/Minecraft-Plugin-green)


<h1 align="center">PowerLauncherJava</h1>
<h2 align="center">💻 Um Launcher para Servidores de Minecraft Java!</h2>

## Oque é um Launcher?
Um Launcher, basicamente é um lançador, tipo: Você cria um arquivo Chamado `MeuProjetoLauncher.java` e deixar isso no **GitHub**, as pessoas vão saber que aquilo vai ser o que seu projeto vai fazer quando ele ligar!

## 🙋 Como Compilar
Basicamente, deixarei o código neste repositório, certo? Ok, mas você deve seguir os termos da licença mas...
- Não irei dar suporte às suas alterações e criações de arquivos
- Lembre-se, a licença é a [Mozilla Public License 2.0](LICENSE), veja o arquivo [LICENSE](LICENSE) para mais informações
### 📝Instruções
- Neste projeto, existe **workflows** específicos para compilar, a maioria dos Workflows são da [PerfectTea](https://github.com/PerfectTeaBR) e da [DreamsBakeryMC](https://github.com/DreamsBakeryMC)
- Tenha o `JDK 21` (ou superior) instalado na sua máquina.
- Tenha o IntelliJ IDEA instalado na sua máquina.
- Tenha um servidor de Minecraft rodando [Paper](https://github.com/PaperMC/Paper) na última versão disponível.
- 🎊 Pronto! Agora é só utilizar o projeto e se divertir!

## 📦 Dependências
Eu utilizei várias dependências no código-fonte do projeto, além de que, se não tiverem essas dependências, esse projeto terias pouquíssimas funções!

| Nome  | Criadores |
| ------------- | ------------- |
| [java](https://dev.java/) | James Gosling  |
| [Paper](https://github.com/PaperMC/Paper) | Mojang ([Minecraft Vanilla](https://minecraft.net/pt-br/download/server)), SpigotMC ([Spigot](https://www.spigotmc.org/)), Paper |
| [DreamsBakery](https://github.com/DreamsBakeryMC/DreamsBakery) | umastrodev12 |

Coloque isso no seu settings.gradle:
```gradle
dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21.8-R0.1-SNAPSHOT")
    implementation 'net.perfect.tea.dreamsbakery.launch:1.0'
}    implementation 'net.dreamsbakery.mc.powerlaunchjava.plugin:1.0'
    implementation 'net.umastrodev.dreamsbakery.java.launch:1.0'
```

## 📄 Licença
Este projeto está licenciado sobre a [Mozilla Public License v2.0](LICENSE), aqui está listado o que você pode, deve e não pode fazer:


## 🟢 Oque você **PODE** Fazer (Direitos)

1.  **Usar** o código-fonte licenciado para qualquer finalidade (uso pessoal, interno, comercial, etc.).
2.  **Modificar** o código-fonte, criando suas próprias melhorias e adições.
3.  **Distribuir** o código-fonte original ou modificado (obrigatório sob a MPL-2.0).
4.  **Combinar** o código MPL-2.0 com outros códigos de licenças diferentes, inclusive **proprietárias**, para criar um "Programa Maior" (exemplo: usar uma biblioteca MPL-2.0 em um aplicativo comercial fechado).
5.  **Cobrar** taxas pela distribuição do software, serviços de suporte ou garantia, mas **não** pela licença do código-fonte em si.

***

## 🔴 Oque você **DEVE** Fazer (Obrigações)

1.  **Disponibilizar Modificações em Arquivos MPL-2.0:** Se você modificar um arquivo que estava sob a MPL-2.0 e distribuir essa modificação, o código desse **arquivo modificado específico** deve ser liberado sob a **MPL-2.0** (o chamado "Copyleft de Nível de Arquivo").
2.  **Fornecer o Código-Fonte:** Ao distribuir o software, você deve disponibilizar o código-fonte de forma acessível e gratuita para todos os usuários que receberem o binário ou executável.
3.  **Manter Avisos de Licença:** Você não pode remover ou alterar os avisos de direitos autorais e licença (incluindo o aviso de "Covered Code") nos arquivos que contêm o código MPL-2.0.

***

## ❌ Oque você **NÃO PODE** Fazer (Restrições)

1.  **Não Usar Marcas para Endosso:** Você não pode usar nomes de contribuidores ou licenciadores (como "Mozilla") para endossar ou promover seu produto derivado sem a permissão expressa deles.
2.  **Não Aplicar Licença Diferente ao Código MPL:** Você não pode licenciar o código-fonte que está sob a MPL-2.0 (nem suas modificações) sob uma licença diferente, **a menos** que esteja distribuindo-o como parte de um Programa Maior compatível (e mesmo assim, o código MPL-2.0 deve permanecer sob essa licença).

***

© umastrodev12 - Todos os Direitos Reservados.

© PerfectTea - Todos os Direitos Reservados.

© DreamsBakery - Todos os Direitos Reservados
