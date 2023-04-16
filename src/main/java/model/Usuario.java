package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {
	@Id
	private int cod_usua;     // --> cod_usua
	private String nom_usua;
	private String ape_usua;
	@Column(name = "usr_usua")
	private String correo;    // --> usr_usua
	@Column(name = "cla_usua")
	private String clave;     // --> cla_usua
	private String fna_usua;
	private int idtipo;
	private int est_usua;
	
	@ManyToOne
	@JoinColumn(name = "idtipo", insertable = false, updatable = false)
	private Tipo objTipo;  // toda la información FK
	
}
