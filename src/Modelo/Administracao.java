
package Modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Ginovaldo Stelio Cumbe
 * 
 */
public class Administracao {
    private long id;
    private String nome;
    private ArrayList<Professores> professores;
    private ArrayList<Alunos> alunos;

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

    public ArrayList<Professores> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professores> professores) {
        this.professores = professores;
    }

    public ArrayList<Alunos> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Alunos> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.professores);
        hash = 19 * hash + Objects.hashCode(this.alunos);
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
        final Administracao other = (Administracao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.professores, other.professores)) {
            return false;
        }
        if (!Objects.equals(this.alunos, other.alunos)) {
            return false;
        }
        return true;
    }
    
    
}
