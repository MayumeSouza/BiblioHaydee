package br.escola.bibliohaydee.model;

    public class Usuario {

        private String nome;
        private String matricula;
        private String tipo;
        private Integer limiteEmprestimos;
        private Integer emprestimosAtivos;

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

