  +----------------------------------+
  |             iPhone               |
  +----------------------------------+
  | - reprodutorMusical: Reprodutor |
  | - aparelhoTelefonico: Telefone  |
  | - navegadorWeb: Navegador       |
  +----------------------------------+

                 ^
                 |
                 |
                 |
                 v

  +----------------------------------+
  |           Reprodutor             |
  +----------------------------------+
  | + reproduzirMusica(): void       |
  | + pausarMusica(): void           |
  | + avancarFaixa(): void           |
  | + retrocederFaixa(): void        |
  +----------------------------------+

  +----------------------------------+
  |           Telefone               |
  +----------------------------------+
  | + fazerChamada(numero: String): void |
  | + receberChamada(): void         |
  | + encerrarChamada(): void        |
  +----------------------------------+

  +----------------------------------+
  |         Navegador                |
  +----------------------------------+
  | + abrirURL(url: String): void    |
  | + fecharURL(): void              |
  | + navegarAtras(): void           |
  | + navegarAdiante(): void         |
  +----------------------------------+
