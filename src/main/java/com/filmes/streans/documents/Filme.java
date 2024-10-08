package com.filmes.streans.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import com.filmes.streans.enums.ClassIndicativa;
import com.filmes.streans.enums.Genero;
import com.filmes.streans.enums.TipoVideo;
import java.util.List;

import jakarta.persistence.Id;

@Document(collection = "Filme")
public class Filme extends Video{

    @Id
    private String id;

    private TipoVideo tipo;
    private List<Genero> genero;
    private ClassIndicativa class_indicativa;

    public Filme(){
    }

    public Filme(String nome, Integer duration, String id, TipoVideo tipo, List<Genero> genero,
            ClassIndicativa class_indicativa) {
        super(nome, duration);
        this.id = id;
        this.tipo = tipo;
        this.genero = genero;
        this.class_indicativa = class_indicativa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoVideo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVideo tipo) {
        this.tipo = tipo;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public ClassIndicativa getClassIndicativa() {
        return class_indicativa;
    }

    public void setClassIndicativa(ClassIndicativa class_indicativa) {
        this.class_indicativa = class_indicativa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Filme other = (Filme) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Filme [id=" + id + ", tipo=" + tipo + ", genero=" + genero + ", class_indicativa=" + class_indicativa
                + "]";
    }

}
