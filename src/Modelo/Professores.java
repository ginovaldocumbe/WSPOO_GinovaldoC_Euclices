
package Modelo;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Ginovaldo Stelio Cumbe
 */
public class Professores {
    
    private long id;
    private String nome;
    private String disciplina;
    private char[] turmas;

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
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public char[] getTurmas() {
        return turmas;
    }

    public void setTurmas(char[] turmas) {
        this.turmas = turmas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.disciplina);
        hash = 89 * hash + Arrays.hashCode(this.turmas);
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
        final Professores other = (Professores) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        if (!Arrays.equals(this.turmas, other.turmas)) {
            return false;
        }
        return true;
    }
    
    
}
