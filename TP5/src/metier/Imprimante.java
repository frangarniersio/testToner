package metier;
import java.util.ArrayList;

/**
 * <p><b>Imprimante</b> est une classe permettant de repr�senter des imprimantes 
 * de l'entreprise <u>TonerExpress</u>.
 * </p>
 * @author fgarnier srouby
 * @version 3.0
 */

public class Imprimante 
{
	/** 
	 * R�f�rence de l'imprimante 
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 */
	private String refImprimante;
	
	/** 
	 * objet TypeImprimante de l'imprimante 
	 * @see Imprimante#Imprimante(String, TypeImprimante, String, ArrayList)
	 */
	private TypeImprimante typeImprimante;
	
	/** 
	 * D�signation de l'imprimante
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
     * @param refImprimante R�f�rence de l'imprimante
     * @param TypeImprimante Objet type de l'imprimante (Laser ou Jet d'encres)
     * @param desImprimante D�signation (nom) de l'imprimante
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
	* Getter sur la r�f�rence de l'imprimante
	* @return La cha�ne correspondant � la r�f�rence de l'imprimante
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
	* @deprecated Java 1.5, collections typ�es {@link Imprimante#setLesCartouches(ArrayList)}
	*/
	public void setLesCart(ArrayList uneListe) 
	{
		this.lesCartouches = uneListe;
	     }


	/** 
	* Permet de conna�tre le nombre de cartouches compatibles avec l'imprimante
	* @return Le nombre d'�l�ments de la collection lesCartouches
	* @see Imprimante#lesCartouches 
	* @exception java.lang.NullPointerException
	*/
	public int getNbCartouchesCompatibles() 
	{
		return this.lesCartouches.size();
	}
	
	
	/** 
	 * Affiche les caract�ristiques de l'imprimante 
	 * @return Cha�ne de caract�res form�es de la r�f�rence, d�signation et du libell� du type de l'imprimante
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
