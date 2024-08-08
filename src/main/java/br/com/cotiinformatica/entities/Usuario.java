package br.com.cotiinformatica.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Usuario {

	private UUID  id;
	private String nome;
	private String email;
	private String senha;
	private Perfil perfil;
	
	{
		
		
	}
}
