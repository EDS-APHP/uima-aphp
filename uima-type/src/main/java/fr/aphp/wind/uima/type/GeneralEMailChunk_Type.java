
/* First created by JCasGen Sat Mar 17 18:58:39 CET 2018 */
package fr.aphp.wind.uima.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.syntax.type.chunk.Chunk_Type;

/** 
 * Updated by JCasGen Sat Mar 17 18:58:39 CET 2018
 * @generated */
public class GeneralEMailChunk_Type extends Chunk_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneralEMailChunk_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneralEMailChunk_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneralEMailChunk(addr, GeneralEMailChunk_Type.this);
  			   GeneralEMailChunk_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneralEMailChunk(addr, GeneralEMailChunk_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneralEMailChunk.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("fr.aphp.wind.uima.type.GeneralEMailChunk");
 
  /** @generated */
  final Feature casFeat_chunkValue;
  /** @generated */
  final int     casFeatCode_chunkValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChunkValue(int addr) {
        if (featOkTst && casFeat_chunkValue == null)
      jcas.throwFeatMissing("chunkValue", "fr.aphp.wind.uima.type.GeneralEMailChunk");
    return ll_cas.ll_getStringValue(addr, casFeatCode_chunkValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChunkValue(int addr, String v) {
        if (featOkTst && casFeat_chunkValue == null)
      jcas.throwFeatMissing("chunkValue", "fr.aphp.wind.uima.type.GeneralEMailChunk");
    ll_cas.ll_setStringValue(addr, casFeatCode_chunkValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeneralEMailChunk_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_chunkValue = jcas.getRequiredFeatureDE(casType, "chunkValue", "uima.cas.String", featOkTst);
    casFeatCode_chunkValue  = (null == casFeat_chunkValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_chunkValue).getCode();

  }
}



    