import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// VER GITHUB Gustavo

public class Clase10 {

	public static void main(String[] args) {
		
		String nombreProyecto = "Mi proyecto";
		int buildNumero = 1;
		
		String contenidoJenkinsFile = 
				"""
				pipeline
				{
					agent any
					stages
					{
						stage("Build")
						{
							steps
							{
								echo "Building " + nombreProyecto + " (Build #" + buildNumero + ")"
							}
						}
					}
				}
				""";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Jenkinsfile"));
			bw.write(contenidoJenkinsFile);
			bw.close();
			System.out.println("Se generó el Jenkinsfile");
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
