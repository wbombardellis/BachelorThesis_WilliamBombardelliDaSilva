/**
 */
package de.silvawb.java.impl;

import de.silvawb.java.Classifier;
import de.silvawb.java.Commentable;
import de.silvawb.java.ConcreteClassifier;
import de.silvawb.java.JavaPackage;
import de.silvawb.java.Member;
import de.silvawb.java.Reference;
import de.silvawb.java.Type;
import de.silvawb.java.TypeParameter;
import de.silvawb.java.TypeReference;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.silvawb.java.impl.TypeParameterImpl#getExtendTypes <em>Extend Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ClassifierImpl implements TypeParameter {
	/**
	 * The cached value of the '{@link #getExtendTypes() <em>Extend Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReference> extendTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getTypeParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getExtendTypes() {
		if (extendTypes == null) {
			extendTypes = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, JavaPackage.TYPE_PARAMETER__EXTEND_TYPES);
		}
		return extendTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.ConcreteClassifier>();
		for( de.silvawb.java.TypeReference typeRef : getExtendTypes()) {
			de.silvawb.java.Type type = typeRef.getTarget();
			if (type instanceof de.silvawb.java.ConcreteClassifier) {
				result.add(( de.silvawb.java.ConcreteClassifier)type);
			}
			if (type instanceof de.silvawb.java.Classifier) {
				result.addAll((( de.silvawb.java.Classifier)type).getAllSuperClassifiers());	
			}
		}		
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getAllMembers(final Commentable context) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Member>();
		
		org.emftext.language.java.util.UniqueEList< de.silvawb.java.Type> possiblyVisibleSuperClassifier = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Type>();
		for( de.silvawb.java.TypeReference typeReference : (( de.silvawb.java.TypeParameter)this).getExtendTypes()) {
			possiblyVisibleSuperClassifier.add(typeReference.getTarget());
		}
		
		for ( de.silvawb.java.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.AnnotableAndModifiable) {					
					de.silvawb.java.AnnotableAndModifiable modifiable = ( de.silvawb.java.AnnotableAndModifiable) member;
		
					if(!modifiable.isHidden(context)) {
						memberList.add(member);
					}
					else if (possiblyVisibleSuperClassifier.contains(superClassifier)) {
						memberList.add(member);
					}
				}
				else {
					memberList.add(member);
				}
			}
			memberList.addAll(superClassifier.getDefaultMembers());
		}
		return memberList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getBoundType(final TypeReference typeReference, final Reference reference) {
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.Type>();
		de.silvawb.java.TypeParametrizable typeParameterDeclarator = ( de.silvawb.java.TypeParametrizable) this.eContainer();
		de.silvawb.java.Reference parentReference = null;
		org.eclipse.emf.common.util.EList< de.silvawb.java.Type> prevTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Type>();
		if (reference != null && 
				reference.getPrevious() instanceof de.silvawb.java.NestedExpression) {
			de.silvawb.java.NestedExpression nestedExpression = ( de.silvawb.java.NestedExpression) reference.getPrevious();
			de.silvawb.java.Expression expression = null;
			if (nestedExpression.getExpression() instanceof de.silvawb.java.Reference) {
				expression = nestedExpression.getExpression();
			}
			else if (nestedExpression.getExpression() instanceof de.silvawb.java.ConditionalExpression) {
				expression = (( de.silvawb.java.ConditionalExpression)nestedExpression.getExpression()).getExpressionIf();
			}
		
			
			if (expression instanceof de.silvawb.java.Reference) {
				de.silvawb.java.Reference expressionReference = ( de.silvawb.java.Reference) expression;
				//navigate down references
				while(expressionReference.getNext() != null) {
					expressionReference = expressionReference.getNext();
				}
				parentReference = expressionReference;
				de.silvawb.java.Type prevType = nestedExpression.getExpression().getType();
				if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
						prevTypeList.add(( de.silvawb.java.Type)aType);
					}
				}
				else {
					prevTypeList.add(prevType);
				}
			}
			else if (nestedExpression.getExpression() instanceof de.silvawb.java.CastExpression) {
				prevTypeList.add((( de.silvawb.java.CastExpression)nestedExpression.getExpression()).getTypeReference().getTarget());
			}
		}
		else if (reference != null && reference.getPrevious() != null) {
			parentReference = reference.getPrevious();
			while (parentReference instanceof de.silvawb.java.SelfReference) {
				if ((( de.silvawb.java.SelfReference)parentReference).getSelf() instanceof de.silvawb.java.Super) {
					if (parentReference.eContainer() instanceof de.silvawb.java.Reference) {
						parentReference = ( de.silvawb.java.Reference) parentReference.eContainer();
					}
					else {
						de.silvawb.java.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
						if (containingClassifier != null) {
							prevTypeList.add(containingClassifier);
						}
						parentReference = null;
					}
				}
				else {
					break;
				}
			}
			if (parentReference != null) {
				de.silvawb.java.Type prevType = parentReference.getReferencedType();
				if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
						prevTypeList.add(( de.silvawb.java.Type)aType);
					}
				}
				else {
					prevTypeList.add(prevType);
				}
			}
		}
		else if (reference != null) {
			//prev type is on of the containing classes which can still bind by inheritance
			de.silvawb.java.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
			while (containingClassifier != null) {
				prevTypeList.add(containingClassifier);
				org.eclipse.emf.ecore.EObject container = containingClassifier.eContainer();
				if (container instanceof de.silvawb.java.Commentable) {
					containingClassifier = (( de.silvawb.java.Commentable) container).getContainingConcreteClassifier();
				} else {
					containingClassifier = null;
				}
			}
		}
		
		for( de.silvawb.java.Type prevType : prevTypeList) {
			int typeParameterIndex = -1;
			if (typeParameterDeclarator instanceof de.silvawb.java.ConcreteClassifier) {
				typeParameterIndex = typeParameterDeclarator.getTypeParameters().indexOf(this);
				if(reference != null) {
					de.silvawb.java.ClassifierReference classifierReference = null;
					if(parentReference instanceof de.silvawb.java.ElementReference) {
						de.silvawb.java.ReferenceableElement prevReferenced = (( de.silvawb.java.ElementReference) parentReference).getTarget();
						if(prevReferenced instanceof de.silvawb.java.TypedElement) {
							de.silvawb.java.TypeReference prevTypeReference = (( de.silvawb.java.TypedElement)prevReferenced).getTypeReference ();
							if (prevTypeReference != null) {
								classifierReference = prevTypeReference.getPureClassifierReference(); 
							}
						}
					}
					if(parentReference instanceof de.silvawb.java.TypedElement) {
						//e.g. New Constructor Call
						de.silvawb.java.TypeReference prevParentReference = (( de.silvawb.java.TypedElement)parentReference).getTypeReference ();
						if (prevParentReference != null) {
							classifierReference = prevParentReference.getPureClassifierReference(); 
						}
					}
					if (prevType instanceof de.silvawb.java.ConcreteClassifier) {
						//bound through inheritance?
						int idx = 0;
						for( de.silvawb.java.ClassifierReference superClassifierReference : (( de.silvawb.java.ConcreteClassifier) prevType).getSuperTypeReferences()) {
							if (typeParameterIndex < superClassifierReference.getTypeArguments().size())  {
								//is this an argument for the correct class?
								if (typeParameterDeclarator.equals(superClassifierReference.getTarget()) ||
										(( de.silvawb.java.Classifier)superClassifierReference.getTarget()).getAllSuperClassifiers().contains(
												typeParameterDeclarator)) {					 
									de.silvawb.java.TypeArgument arg = superClassifierReference.getTypeArguments().get(typeParameterIndex);
									if (arg instanceof de.silvawb.java.QualifiedTypeArgument) {
										resultList.add(idx, (( de.silvawb.java.QualifiedTypeArgument) arg).getTypeReference().getTarget());
										idx++;
									}
								}
			
							}
						}
						org.eclipse.emf.common.util.EList< de.silvawb.java.TypeArgument> typeArgumentList;
						org.emftext.language.java.util.TemporalTypeArgumentHolder ttah = null;
						for( org.eclipse.emf.common.notify.Adapter adapter : prevType.eAdapters()) {
							if (adapter instanceof org.emftext.language.java.util.TemporalTypeArgumentHolder) {
								ttah = ( org.emftext.language.java.util.TemporalTypeArgumentHolder) adapter; 
								prevType.eAdapters().remove(ttah);
								break;
							}
						}
						if (ttah != null) {
							typeArgumentList = ttah.getTypeArguments();
						}
						else if (classifierReference != null) {
							typeArgumentList = classifierReference.getTypeArguments();
						}
						else {
							typeArgumentList = org.eclipse.emf.common.util.ECollections.emptyEList();
						}
						
						if (typeParameterIndex < typeArgumentList.size())  {
							de.silvawb.java.TypeArgument arg = typeArgumentList.get(typeParameterIndex);
							if (arg instanceof de.silvawb.java.QualifiedTypeArgument) {
								de.silvawb.java.ClassifierReference theTypeRef = (( de.silvawb.java.QualifiedTypeArgument) arg).getTypeReference().getPureClassifierReference();
								if (theTypeRef != null) {
									de.silvawb.java.Type theType = theTypeRef.getBoundTarget(parentReference);
									if (theType != null) {
										if (!theTypeRef.getTypeArguments().isEmpty()) {
											ttah = new org.emftext.language.java.util.TemporalTypeArgumentHolder();
											ttah.getTypeArguments().addAll(theTypeRef.getTypeArguments());
											theType.eAdapters().add(ttah);
										}
										resultList.add(0, theType);
									}
								}
							}
							if (arg instanceof de.silvawb.java.ExtendsTypeArgument) {
								for( de.silvawb.java.TypeReference extendedType : (( de.silvawb.java.ExtendsTypeArgument) arg).getExtendTypes()) {
									resultList.add(0, extendedType.getBoundTarget(parentReference));
								}
							}
						}
			
					}
					else if (prevType instanceof de.silvawb.java.TypeParameter) {
						//the prev. type parameter, although unbound, may contain type restrictions through extends 
						resultList.add(prevType);
						for( de.silvawb.java.TypeReference extendedRef : (( de.silvawb.java.TypeParameter) prevType).getExtendTypes()) {
							de.silvawb.java.ConcreteClassifier extended = ( de.silvawb.java.ConcreteClassifier)extendedRef.getTarget();
							int idx = (( de.silvawb.java.TypeParametrizable)prevType.eContainer()).getTypeParameters().indexOf(prevType);
							if (extended.getTypeParameters().size() > idx) {
								//also add more precise bindings from extensions
								resultList.add(extended.getTypeParameters().get(idx));
							}
						}
					}
				}
				if(reference != null && reference.eContainer() instanceof de.silvawb.java.ReflectiveClassReference) {
					if (reference.eContainer().eContainer() instanceof de.silvawb.java.Reference) {
						//the ".class" instantiation implicitly binds the T parameter of java.lang.Class to the class itself
						resultList.add(0, (( de.silvawb.java.Reference)reference.eContainer().eContainer()).getReferencedType());
					}
				}
			}
		}
		
		if (typeParameterDeclarator instanceof de.silvawb.java.Method) {
			if (reference instanceof de.silvawb.java.MethodCall) {
				de.silvawb.java.Method method = ( de.silvawb.java.Method) typeParameterDeclarator;
				de.silvawb.java.MethodCall methodCall = ( de.silvawb.java.MethodCall) reference;
				if(method.getTypeParameters().size() == methodCall.getCallTypeArguments().size()) {
					de.silvawb.java.TypeArgument typeArgument = methodCall.getCallTypeArguments().get(method.getTypeParameters().indexOf(this));
					if (typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
						resultList.add(0, (( de.silvawb.java.QualifiedTypeArgument)typeArgument).getTypeReference().getBoundTarget(parentReference)); 
					} 
				}
		
				//class type parameter
				int idx = method.getParameters().indexOf(typeReference.eContainer());
				
				//method type parameter
				if (idx == -1) {
					for( de.silvawb.java.Parameter parameter : method.getParameters()) {
						for ( de.silvawb.java.TypeArgument typeArgument : parameter.getTypeArguments()) {
							if(typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
								if((( de.silvawb.java.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
									idx = method.getParameters().indexOf(parameter);
								}
							}
						}
						de.silvawb.java.ClassifierReference paramTypeReference = parameter.getTypeReference().getPureClassifierReference();
						if (paramTypeReference != null) {
							for ( de.silvawb.java.TypeArgument typeArgument : paramTypeReference.getTypeArguments()) {
								if(typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
									if(this.equals((( de.silvawb.java.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget())) {
										idx = method.getParameters().indexOf(parameter);
									}
								}
							}
						}
					}
				}
				
				if (idx < methodCall.getArguments().size() && idx >= 0) {
					de.silvawb.java.Expression argument = methodCall.getArguments().get(idx);
					de.silvawb.java.Parameter parameter = method.getParameters().get(idx);
					de.silvawb.java.ClassifierReference parameterType = parameter.getTypeReference().getPureClassifierReference();
					if (argument instanceof de.silvawb.java.NewConstructorCall) {
						de.silvawb.java.ClassifierReference argumentType = (( de.silvawb.java.NewConstructorCall)argument).getTypeReference().getPureClassifierReference();
						if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
							for( de.silvawb.java.TypeArgument typeArgument : parameterType.getTypeArguments()) {
								if(typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
									if((( de.silvawb.java.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
										resultList.add(0, (( de.silvawb.java.QualifiedTypeArgument)argumentType.getTypeArguments().get(parameterType.getTypeArguments().indexOf(typeArgument))).getTypeReference(
											).getTarget());
									}
								}
							}
						}
						if (argumentType != null && parameterType.getTarget() instanceof de.silvawb.java.TypeParameter) {
							resultList.add(0,argumentType.getTarget());
						}
					}
					else if (parameterType != null && argument instanceof de.silvawb.java.Reference) {
						de.silvawb.java.Reference argReference = ( de.silvawb.java.Reference) argument;
						
						while (argReference.getNext() instanceof de.silvawb.java.Reference &&
								!(argReference.getNext() instanceof de.silvawb.java.ReflectiveClassReference) ) {
							argReference = argReference.getNext();
						}
			
						
						if (argReference instanceof de.silvawb.java.ElementReference) {
							de.silvawb.java.ElementReference elementReference = ( de.silvawb.java.ElementReference) argReference;
							while (elementReference.getNext() instanceof de.silvawb.java.ElementReference) {
								elementReference = ( de.silvawb.java.ElementReference) elementReference.getNext();
							}
							if (elementReference.getTarget() instanceof de.silvawb.java.TypedElement) {
								de.silvawb.java.ClassifierReference argumentType = (( de.silvawb.java.TypedElement)elementReference.getTarget()).getTypeReference().getPureClassifierReference();
								if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
									for( de.silvawb.java.TypeArgument typeArgument : parameterType.getTypeArguments()) {
										if(typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
											if((( de.silvawb.java.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
												int idx2 = parameterType.getTypeArguments().indexOf(typeArgument);
												if (argumentType.getTypeArguments().get(idx2) instanceof de.silvawb.java.QualifiedTypeArgument) {
													resultList.add(0, (( de.silvawb.java.QualifiedTypeArgument)argumentType.getTypeArguments().get(idx2)).getTypeReference().getTarget());
												}
												else if (argumentType.getTypeArguments().get(idx2) instanceof de.silvawb.java.ExtendsTypeArgument) {
													for( de.silvawb.java.TypeReference extendedType : (( de.silvawb.java.ExtendsTypeArgument) argumentType.getTypeArguments().get(idx2)).getExtendTypes()) {
														resultList.add(0, extendedType.getTarget());
													}
												}
											}
										}
									}
								}
								if (argumentType != null && parameterType.getTarget() instanceof de.silvawb.java.TypeParameter) {
									resultList.add(0,argumentType.getTarget());
								}
							}
							if(elementReference.getNext() instanceof de.silvawb.java.ReflectiveClassReference) {
								if (parameterType.getTypeArguments().size() == 1) {
									for( de.silvawb.java.TypeArgument typeArgument : parameterType.getTypeArguments()) {
										if(typeArgument instanceof de.silvawb.java.QualifiedTypeArgument) {
											if((( de.silvawb.java.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
												resultList.add(0, elementReference.getReferencedType());
											}
										}
									}
								}
							}
						}
						else {
							if (parameterType.getTarget() instanceof de.silvawb.java.TypeParameter) {
								while (argReference.getNext() instanceof de.silvawb.java.Reference) {
									argReference = argReference.getNext();
								}
								resultList.add(0, (( de.silvawb.java.Reference) argReference).getReferencedType());
							}
						}
					}			
				}
				
				//return type
				if(method.equals(typeReference.eContainer())) {
					//bound by the type of a method argument?
					org.eclipse.emf.common.util.EList< de.silvawb.java.Classifier> allSuperTypes = null;
					for( de.silvawb.java.Parameter parameter : method.getParameters()) {
						if(this.equals(parameter.getTypeReference().getTarget())) {
							idx = method.getParameters().indexOf(parameter);
							de.silvawb.java.Classifier argumentType = ( de.silvawb.java.Classifier) methodCall.getArguments().get(idx).getType();
							if(allSuperTypes == null) {
								allSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Classifier>();
								allSuperTypes.add(argumentType);
								allSuperTypes.addAll(argumentType.getAllSuperClassifiers());
							}
							else {
								allSuperTypes.add(argumentType);
								org.eclipse.emf.common.util.EList< de.silvawb.java.Classifier> allOtherSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Classifier>();
								allOtherSuperTypes.add(argumentType);
								allOtherSuperTypes.addAll(argumentType.getAllSuperClassifiers());
								org.eclipse.emf.common.util.EList< de.silvawb.java.Classifier> temp = allSuperTypes;
								allSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.Classifier>();
								for( de.silvawb.java.Classifier st : allOtherSuperTypes) {
									if(temp.contains(st)) {
										allSuperTypes.add(st);
									}
								}
							}
						}
			 				}
					//all types given by all bindings
					if (allSuperTypes != null) {
						resultList.addAll(allSuperTypes);
					}
				}
			}
		}
		
		//remove nulls
		for( java.util.Iterator<?> it = resultList.iterator(); it.hasNext(); ) {
			if (it.next() == null) {
				it.remove();
			}
		}
		
		if(resultList.isEmpty() || 
				(resultList.size() == 1 && resultList.get(0).equals(this))) {
			return this;
		}
		else {
			org.emftext.language.java.util.TemporalCompositeClassifier temp = new org.emftext.language.java.util.TemporalCompositeClassifier(this);
			for( de.silvawb.java.Type aResult : resultList) {
				if(aResult instanceof de.silvawb.java.PrimitiveType) {
					aResult = (( de.silvawb.java.PrimitiveType) aResult).wrapPrimitiveType();
				}
				
				if (aResult instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					//flatten
					temp.getSuperTypes().addAll((( org.emftext.language.java.util.TemporalCompositeClassifier)aResult).getSuperTypes());
				}
				else {
					temp.getSuperTypes().add(( de.silvawb.java.Classifier) aResult);	
				}
			}
			temp.getSuperTypes().add(this);
			return temp;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return ((InternalEList<?>)getExtendTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return getExtendTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__EXTEND_TYPES:
				getExtendTypes().clear();
				getExtendTypes().addAll((Collection<? extends TypeReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__EXTEND_TYPES:
				getExtendTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaPackage.TYPE_PARAMETER__EXTEND_TYPES:
				return extendTypes != null && !extendTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case JavaPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return JavaPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseOperationID) {
				case JavaPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return JavaPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
			case JavaPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case JavaPackage.TYPE_PARAMETER___GET_BOUND_TYPE__TYPEREFERENCE_REFERENCE:
				return getBoundType((TypeReference)arguments.get(0), (Reference)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeParameterImpl
