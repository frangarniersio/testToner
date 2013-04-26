package metier;
import java.util.ArrayList;

/**
 * <p><b>Imprimante</b> est une classe permettant de représenter des imprimantes 
 * de l'entreprise <u>TonerExpress</u>.
 * </p>
 * @author fgarnier srouby
 * @version 3.0
 */

public class Imprimante 
{
	/** 
	 * Référence de l'imprimante 
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 */
	private String refImprimante;
	
	/** 
	 * objet TypeImprimante de l'imprimante 
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 */
	private TypeImprimante typeImprimante;
	
	/** 
	 * Désignation de l'imprimante
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 */
	private String desImprimante;
	
	/** 
	 * Collection de Cartouches compatibles avec l'imprimante 
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 * @see Imprimante#getLesCartouches()
	 * @see Imprimante#setLesCartouches(ArrayList)
	 */
	private ArrayList<Cartouche> lesCartouches;
 
	
    /** Constructeur d'imprimantes 
     * @param refImprimante Référence de l'imprimante
     * @param TypeImprimante Objet type de l'imprimante (Laser ou Jet d'encres)
     * @param desImprimante Désignation (nom) de l'imprimante
     * @param lesCartouches Collection de cartouches
     * 
     * @see metier.Imprimante#refImprimante
     * @see metier.Imprimante#typeImprimante
     * @see metier.Imprimante#desImprimante
     * @see metier.Imprimante#lesCartouches
     */
	public Imprimante(String refImprimante, TypeImprimante typeImprimante, String desImprimante, ArrayList<Cartouche> lesCartouches) 
	{
		this.refImprimante = refImprimante;
		this.typeImprimante = typeImprimante;
		this.desImprimante = desImprimante;
		this.lesCartouches = lesCartouches;
	}

	
	/**
	* Getter sur la référence de l'imprimante
	* @return La chaîne correspondant à la référence de l'imprimante
	* @see Imprimante#refImprimante
	* @since 3.0
	*/
	public String getRefImprimante()
	{
		return refImprimante;
	}



	/** 
	 * Getter sur la collection de Cartouches de l'imprimante	
	 * @return La collection de cartouches de l'imprimante
	 * @see Imprimante#lesCartouches
	 */
	public ArrayList<Cartouche> getLesCartouches() 
	{
		return this.lesCartouches;
	}
	
	
	/**
	* Setter sur la collection de Cartouches de l'imprimante	
	* @param uneListe 
	*               Collection de cartouches compatibles avec imprimante courante
	* @see Imprimante#lesCartouches
	*/
	public void setLesCartouches(ArrayList<Cartouche> uneListe) 
	{
		this.lesCartouches = uneListe;
	}

	/**
	* @param uneListe
	*               Collection de cartouches compatibles avec imprimante courante
	* @deprecated Java 1.5, collections typées {@link Imprimante#setLesCartouches(ArrayList)}
	*/
	public void setLesCart(ArrayList uneListe) 
	{
		this.lesCartouches = uneListe;
	     }


	/** 
	* Permet de connaître le nombre de cartouches compatibles avec l'imprimante
	* @return Le nombre d'éléments de la collection lesCartouches
	* @see Imprimante#lesCartouches 
	* @exception java.lang.NullPointerException
	*/
	public int getNbCartouchesCompatibles() 
	{
		return this.lesCartouches.size();
	}
	
	
	/** 
	 * Affiche les caractéristiques de l'imprimante 
	 * @return Chaîne de caractères formées de la référence, désignation et du libellé du type de l'imprimante
	 * @see Imprimante#refImprimante
	 * @see Imprimante#desImprimante
	 * @see TypeImprimante#getLibelle()
	 */
	public String toString()
	{
		String msg = this.refImprimante+" - "+this.desImprimante+" - "+this.typeImprimante.getLibelle();
		return msg;
	}
}
