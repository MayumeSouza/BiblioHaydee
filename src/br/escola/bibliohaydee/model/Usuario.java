package br.escola.bibliohaydee.model;

    public class Usuario {
        public static final int LIMITE_PADRAO = 3;
        private String nome;
        private String matricula;
        private String tipo;
        private Integer limiteEmprestimos;
        private Integer emprestimosAtivos;

        public Usuario(String nome, String matricula, String tipo) {
            this(nome, matricula, tipo, LIMITE_PADRAO);
        }

        public Usuario(String nomeUsuario, String matriculaUsuario, String tipoUsuario, Integer limite) {

            if (nomeUsuario == null || nomeUsuario.trim().isEmpty()) {
                throw new IllegalArgumentException("O nome não pode ser vazio.");
            }

            if (!tipoUsuario.equalsIgnoreCase("ALUNO") && !tipoUsuario.equalsIgnoreCase("PROFESSOR")) {
                throw new IllegalArgumentException("O tipo deve ser ALUNO ou PROFESSOR.");
            }

            nome = nomeUsuario;
            matricula = matriculaUsuario;
            tipo = tipoUsuario;
            limiteEmprestimos = limite;
            emprestimosAtivos = 0;
        }

        public String getNome() {
            return nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public String getTipo() {
            return tipo;
        }

        public Integer getLimiteEmprestimos() {
            return limiteEmprestimos;
        }

        public Integer getEmprestimosAtivos() {
            return emprestimosAtivos;
        }

        private boolean nomeValido(String nome) {
            return nome != null && !nome.trim().isEmpty();
        }

        private boolean limiteValido(Integer limite) {
            return limite != null && limite > 0;
        }

        public void setNome(String nome) {
            if (!nomeValido(nome)) {
                throw new IllegalArgumentException("O nome não pode ser vazio.");
            }
            this.nome = nome;
        }

        public void setLimiteEmprestimos(Integer limite) {
            if (!limiteValido(limite)) {
                throw new IllegalArgumentException("O limite deve ser maior que zero.");
            }
            this.limiteEmprestimos = limite;
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "nome='" + nome + '\'' +
                    ", matricula='" + matricula + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", limiteEmprestimos=" + limiteEmprestimos +
                    ", emprestimosAtivos=" + emprestimosAtivos +
                    '}';
        }

    }

