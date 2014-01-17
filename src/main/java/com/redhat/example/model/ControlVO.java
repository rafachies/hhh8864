package com.redhat.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name="control")
public class ControlVO {
	@Embeddable
	public static class ControleVencidoVOId implements Serializable {
		@Column(name = "cve_nro_documento_devedor", unique = false, nullable = false, insertable = true, updatable = true)
		private Long numeroDocumentoDevedor;
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "cve_dt_criacao", unique = false, nullable = false, insertable = true, updatable = true)
		private Long dataCriacao;

		public ControleVencidoVOId() {
		}

		public ControleVencidoVOId(Long codigoCooperativaSingular,
				Long numeroDocumentoDevedor, Long dataCriacao) {
			this.numeroDocumentoDevedor = numeroDocumentoDevedor;
			this.dataCriacao = dataCriacao;
		}

		public Long getNumeroDocumentoDevedor() {
			return numeroDocumentoDevedor;
		}

		public void setNumeroDocumentoDevedor(Long numeroDocumentoDevedor) {
			this.numeroDocumentoDevedor = numeroDocumentoDevedor;
		}

		public Long getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(Long dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ControleVencidoVOId other = (ControleVencidoVOId) obj;
			if (dataCriacao == null) {
				if (other.dataCriacao != null)
					return false;
			} else if (!dataCriacao.equals(other.dataCriacao))
				return false;
			if (numeroDocumentoDevedor == null) {
				if (other.numeroDocumentoDevedor != null)
					return false;
			} else if (!numeroDocumentoDevedor
					.equals(other.numeroDocumentoDevedor))
				return false;
			return true;
		}

	}

	@EmbeddedId
	private ControleVencidoVOId id = new ControleVencidoVOId();

	@Column(name = "cve_usuario", unique = false, nullable = false, insertable = true, updatable = true)
	private String usuario;

	@Transient
	private Integer diasAtraso;

	public ControlVO() {
	}

	public ControleVencidoVOId getId() {
		return id;
	}

	public void setId(ControleVencidoVOId id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public Integer getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(Integer diasAtraso) {
		this.diasAtraso = diasAtraso;
	}

}