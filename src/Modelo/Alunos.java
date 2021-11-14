
package Modelo;

import java.util.Objects;

/**
 *
 * @author Ginovaldo Stelio Cumbe
 */
public class Alunos {
    private long id;
    private String nome;
    private String disciplinas;
    private int nota1,nota2,nota3,notaF;
    private int classe;
    private char turma;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(String disciplina) {
        this.disciplinas = disciplina;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNotaF() {
        return notaF;
    }

    public void setNotaF(int notaF) {
        this.notaF = notaF;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public char getTurma() {
        return turma;
    }

    public void setTurma(char turma) {
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.disciplinas);
        hash = 97 * hash + this.nota1;
        hash = 97 * hash + this.nota2;
        hash = 97 * hash + this.nota3;
        hash = 97 * hash + this.notaF;
        hash = 97 * hash + this.classe;
        hash = 97 * hash + this.turma;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alunos other = (Alunos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nota1 != other.nota1) {
            return false;
        }
        if (this.nota2 != other.nota2) {
            return false;
        }
        if (this.nota3 != other.nota3) {
            return false;
        }
        if (this.notaF != other.notaF) {
            return false;
        }
        if (this.classe != other.classe) {
            return false;
        }
        if (this.turma != other.turma) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.disciplinas, other.disciplinas)) {
            return false;
        }
        return true;
    }

   
    
    
}
