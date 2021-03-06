/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.location.cts.asn1.supl2.supl_pos;

/*
 */


//
//
import android.location.cts.asn1.base.Asn1Null;
import android.location.cts.asn1.base.Asn1Object;
import android.location.cts.asn1.base.Asn1Sequence;
import android.location.cts.asn1.base.Asn1Tag;
import android.location.cts.asn1.base.BitStream;
import android.location.cts.asn1.base.BitStreamReader;
import android.location.cts.asn1.base.SequenceComponent;
import android.location.cts.asn1.supl2.ulp_components.Velocity;
import android.location.cts.asn1.supl2.ulp_version_2_message_extensions.Ver2_SUPL_POS_extension;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
*/
public  class SUPLPOS extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_SUPLPOS
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SUPLPOS() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SUPLPOS;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SUPLPOS != null) {
      return ImmutableList.of(TAG_SUPLPOS);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SUPLPOS from encoded stream.
   */
  public static SUPLPOS fromPerUnaligned(byte[] encodedBytes) {
    SUPLPOS result = new SUPLPOS();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SUPLPOS from encoded stream.
   */
  public static SUPLPOS fromPerAligned(byte[] encodedBytes) {
    SUPLPOS result = new SUPLPOS();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private PosPayLoad posPayLoad_;
  public PosPayLoad getPosPayLoad() {
    return posPayLoad_;
  }
  /**
   * @throws ClassCastException if value is not a PosPayLoad
   */
  public void setPosPayLoad(Asn1Object value) {
    this.posPayLoad_ = (PosPayLoad) value;
  }
  public PosPayLoad setPosPayLoadToNewInstance() {
    posPayLoad_ = new PosPayLoad();
    return posPayLoad_;
  }
  
  private Velocity velocity_;
  public Velocity getVelocity() {
    return velocity_;
  }
  /**
   * @throws ClassCastException if value is not a Velocity
   */
  public void setVelocity(Asn1Object value) {
    this.velocity_ = (Velocity) value;
  }
  public Velocity setVelocityToNewInstance() {
    velocity_ = new Velocity();
    return velocity_;
  }
  

  
  private Ver2_SUPL_POS_extension  extensionVer2_SUPL_POS_extension;
  public Ver2_SUPL_POS_extension getExtensionVer2_SUPL_POS_extension() {
    return extensionVer2_SUPL_POS_extension;
  }
  /**
   * @throws ClassCastException if value is not a Ver2_SUPL_POS_extension
   */
  public void setExtensionVer2_SUPL_POS_extension(Asn1Object value) {
    extensionVer2_SUPL_POS_extension = (Ver2_SUPL_POS_extension) value;
  }
  public void setExtensionVer2_SUPL_POS_extensionToNewInstance() {
    extensionVer2_SUPL_POS_extension = new Ver2_SUPL_POS_extension();
  }
    

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getPosPayLoad() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getPosPayLoad();
          }

          @Override public void setToNewInstance() {
            setPosPayLoadToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? PosPayLoad.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "posPayLoad : "
                    + getPosPayLoad().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getVelocity() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getVelocity();
          }

          @Override public void setToNewInstance() {
            setVelocityToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? Velocity.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "velocity : "
                    + getVelocity().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      builder.add(new SequenceComponent() {
            @Override public boolean isExplicitlySet() {
              return getExtensionVer2_SUPL_POS_extension() != null;
            }

            @Override public boolean hasDefaultValue() {
              return false;
            }

            @Override public boolean isOptional() {
              return true;
            }

            @Override public Asn1Object getComponentValue() {
              return getExtensionVer2_SUPL_POS_extension();
            }

            @Override public void setToNewInstance() {
              setExtensionVer2_SUPL_POS_extensionToNewInstance();
            }

            @Override public Collection<Asn1Tag> getPossibleFirstTags() {
              throw new UnsupportedOperationException(
                  "BER decoding not supported for extension elements");
            }

            @Override
            public Asn1Tag getTag() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override
            public boolean isImplicitTagging() {
              throw new UnsupportedOperationException(
                  "BER is not supported for extension elements");
            }

            @Override public String toIndentedString(String indent) {
              return "ver2_SUPL_POS_extension : "
                  + getExtensionVer2_SUPL_POS_extension().toIndentedString(indent);
            }
      });
      
      return builder.build();
    }

  
  
  
  
  

    
    
    

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    StringBuilder builder = new StringBuilder();
    builder.append("SUPLPOS = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}
