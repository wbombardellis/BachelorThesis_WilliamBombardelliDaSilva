/**
 */
package de.silvawb.java.generics.impl;

import de.silvawb.java.classifiers.Classifier;
import de.silvawb.java.classifiers.ClassifiersPackage;
import de.silvawb.java.classifiers.ConcreteClassifier;

import de.silvawb.java.classifiers.impl.ClassifierImpl;

import de.silvawb.java.commons.Commentable;

import de.silvawb.java.generics.GenericsPackage;
import de.silvawb.java.generics.TypeArgument;
import de.silvawb.java.generics.TypeParameter;

import de.silvawb.java.members.Member;

import de.silvawb.java.references.Reference;

import de.silvawb.java.types.Type;
import de.silvawb.java.types.TypeReference;
import de.silvawb.java.types.TypesPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
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
 *   <li>{@link de.silvawb.java.generics.impl.TypeParameterImpl#getExtendTypes <em>Extend Types</em>}</li>
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
		return GenericsPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReference> getExtendTypes() {
		if (extendTypes == null) {
			extendTypes = new EObjectContainmentEList<TypeReference>(TypeReference.class, this, GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES);
		}
		return extendTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteClassifier> getAllSuperClassifiers() {
		org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.ConcreteClassifier> result = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.ConcreteClassifier>();
		for( de.silvawb.java.types.TypeReference typeRef : getExtendTypes()) {
			de.silvawb.java.types.Type type = typeRef.getTarget();
			if (type instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
				result.add(( de.silvawb.java.classifiers.ConcreteClassifier)type);
			}
			if (type instanceof de.silvawb.java.classifiers.Classifier) {
				result.addAll((( de.silvawb.java.classifiers.Classifier)type).getAllSuperClassifiers());	
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.members.Member> memberList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.members.Member>();
		
		org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.Type> possiblyVisibleSuperClassifier = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.Type>();
		for( de.silvawb.java.types.TypeReference typeReference : (( de.silvawb.java.generics.TypeParameter)this).getExtendTypes()) {
			possiblyVisibleSuperClassifier.add(typeReference.getTarget());
		}
		
		for ( de.silvawb.java.classifiers.ConcreteClassifier superClassifier : getAllSuperClassifiers()) {
			for( de.silvawb.java.members.Member member : superClassifier.getMembers()) {
				if(member instanceof de.silvawb.java.modifiers.AnnotableAndModifiable) {					
					de.silvawb.java.modifiers.AnnotableAndModifiable modifiable = ( de.silvawb.java.modifiers.AnnotableAndModifiable) member;
		
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
		org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> resultList = new org.eclipse.emf.common.util.BasicEList< de.silvawb.java.types.Type>();
		de.silvawb.java.generics.TypeParametrizable typeParameterDeclarator = ( de.silvawb.java.generics.TypeParametrizable) this.eContainer();
		de.silvawb.java.references.Reference parentReference = null;
		org.eclipse.emf.common.util.EList< de.silvawb.java.types.Type> prevTypeList = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.types.Type>();
		if (reference != null && 
				reference.getPrevious() instanceof de.silvawb.java.expressions.NestedExpression) {
			de.silvawb.java.expressions.NestedExpression nestedExpression = ( de.silvawb.java.expressions.NestedExpression) reference.getPrevious();
			de.silvawb.java.expressions.Expression expression = null;
			if (nestedExpression.getExpression() instanceof de.silvawb.java.references.Reference) {
				expression = nestedExpression.getExpression();
			}
			else if (nestedExpression.getExpression() instanceof de.silvawb.java.expressions.ConditionalExpression) {
				expression = (( de.silvawb.java.expressions.ConditionalExpression)nestedExpression.getExpression()).getExpressionIf();
			}
		
			
			if (expression instanceof de.silvawb.java.references.Reference) {
				de.silvawb.java.references.Reference expressionReference = ( de.silvawb.java.references.Reference) expression;
				//navigate down references
				while(expressionReference.getNext() != null) {
					expressionReference = expressionReference.getNext();
				}
				parentReference = expressionReference;
				de.silvawb.java.types.Type prevType = nestedExpression.getExpression().getType();
				if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
						prevTypeList.add(( de.silvawb.java.types.Type)aType);
					}
				}
				else {
					prevTypeList.add(prevType);
				}
			}
			else if (nestedExpression.getExpression() instanceof de.silvawb.java.expressions.CastExpression) {
				prevTypeList.add((( de.silvawb.java.expressions.CastExpression)nestedExpression.getExpression()).getTypeReference().getTarget());
			}
		}
		else if (reference != null && reference.getPrevious() != null) {
			parentReference = reference.getPrevious();
			while (parentReference instanceof de.silvawb.java.references.SelfReference) {
				if ((( de.silvawb.java.references.SelfReference)parentReference).getSelf() instanceof de.silvawb.java.literals.Super) {
					if (parentReference.eContainer() instanceof de.silvawb.java.references.Reference) {
						parentReference = ( de.silvawb.java.references.Reference) parentReference.eContainer();
					}
					else {
						de.silvawb.java.classifiers.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
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
				de.silvawb.java.types.Type prevType = parentReference.getReferencedType();
				if(prevType instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					for( org.eclipse.emf.ecore.EObject aType : (( org.emftext.language.java.util.TemporalCompositeClassifier)prevType).getSuperTypes()) {
						prevTypeList.add(( de.silvawb.java.types.Type)aType);
					}
				}
				else {
					prevTypeList.add(prevType);
				}
			}
		}
		else if (reference != null) {
			//prev type is on of the containing classes which can still bind by inheritance
			de.silvawb.java.classifiers.ConcreteClassifier containingClassifier = reference.getContainingConcreteClassifier();
			while (containingClassifier != null) {
				prevTypeList.add(containingClassifier);
				org.eclipse.emf.ecore.EObject container = containingClassifier.eContainer();
				if (container instanceof de.silvawb.java.commons.Commentable) {
					containingClassifier = (( de.silvawb.java.commons.Commentable) container).getContainingConcreteClassifier();
				} else {
					containingClassifier = null;
				}
			}
		}
		
		for( de.silvawb.java.types.Type prevType : prevTypeList) {
			int typeParameterIndex = -1;
			if (typeParameterDeclarator instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
				typeParameterIndex = typeParameterDeclarator.getTypeParameters().indexOf(this);
				if(reference != null) {
					de.silvawb.java.types.ClassifierReference classifierReference = null;
					if(parentReference instanceof de.silvawb.java.references.ElementReference) {
						de.silvawb.java.references.ReferenceableElement prevReferenced = (( de.silvawb.java.references.ElementReference) parentReference).getTarget();
						if(prevReferenced instanceof de.silvawb.java.types.TypedElement) {
							de.silvawb.java.types.TypeReference prevTypeReference = (( de.silvawb.java.types.TypedElement)prevReferenced).getTypeReference ();
							if (prevTypeReference != null) {
								classifierReference = prevTypeReference.getPureClassifierReference(); 
							}
						}
					}
					if(parentReference instanceof de.silvawb.java.types.TypedElement) {
						//e.g. New Constructor Call
						de.silvawb.java.types.TypeReference prevParentReference = (( de.silvawb.java.types.TypedElement)parentReference).getTypeReference ();
						if (prevParentReference != null) {
							classifierReference = prevParentReference.getPureClassifierReference(); 
						}
					}
					if (prevType instanceof de.silvawb.java.classifiers.ConcreteClassifier) {
						//bound through inheritance?
						int idx = 0;
						for( de.silvawb.java.types.ClassifierReference superClassifierReference : (( de.silvawb.java.classifiers.ConcreteClassifier) prevType).getSuperTypeReferences()) {
							if (typeParameterIndex < superClassifierReference.getTypeArguments().size())  {
								//is this an argument for the correct class?
								if (typeParameterDeclarator.equals(superClassifierReference.getTarget()) ||
										(( de.silvawb.java.classifiers.Classifier)superClassifierReference.getTarget()).getAllSuperClassifiers().contains(
												typeParameterDeclarator)) {					 
									de.silvawb.java.generics.TypeArgument arg = superClassifierReference.getTypeArguments().get(typeParameterIndex);
									if (arg instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
										resultList.add(idx, (( de.silvawb.java.generics.QualifiedTypeArgument) arg).getTypeReference().getTarget());
										idx++;
									}
								}
			
							}
						}
						org.eclipse.emf.common.util.EList< de.silvawb.java.generics.TypeArgument> typeArgumentList;
						de.silvawb.java.util.TemporalTypeArgumentHolder ttah = null;
						for( org.eclipse.emf.common.notify.Adapter adapter : prevType.eAdapters()) {
							if (adapter instanceof org.emftext.language.java.util.TemporalTypeArgumentHolder) {
								ttah = ( de.silvawb.java.util.TemporalTypeArgumentHolder) adapter; 
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
							de.silvawb.java.generics.TypeArgument arg = typeArgumentList.get(typeParameterIndex);
							if (arg instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
								de.silvawb.java.types.ClassifierReference theTypeRef = (( de.silvawb.java.generics.QualifiedTypeArgument) arg).getTypeReference().getPureClassifierReference();
								if (theTypeRef != null) {
									de.silvawb.java.types.Type theType = theTypeRef.getBoundTarget(parentReference);
									if (theType != null) {
										if (!theTypeRef.getTypeArguments().isEmpty()) {
											ttah = new de.silvawb.java.util.TemporalTypeArgumentHolder();
											ttah.getTypeArguments().addAll(theTypeRef.getTypeArguments());
											theType.eAdapters().add(ttah);
										}
										resultList.add(0, theType);
									}
								}
							}
							if (arg instanceof de.silvawb.java.generics.ExtendsTypeArgument) {
								for( de.silvawb.java.types.TypeReference extendedType : (( de.silvawb.java.generics.ExtendsTypeArgument) arg).getExtendTypes()) {
									resultList.add(0, extendedType.getBoundTarget(parentReference));
								}
							}
						}
			
					}
					else if (prevType instanceof de.silvawb.java.generics.TypeParameter) {
						//the prev. type parameter, although unbound, may contain type restrictions through extends 
						resultList.add(prevType);
						for( de.silvawb.java.types.TypeReference extendedRef : (( de.silvawb.java.generics.TypeParameter) prevType).getExtendTypes()) {
							de.silvawb.java.classifiers.ConcreteClassifier extended = ( de.silvawb.java.classifiers.ConcreteClassifier)extendedRef.getTarget();
							int idx = (( de.silvawb.java.generics.TypeParametrizable)prevType.eContainer()).getTypeParameters().indexOf(prevType);
							if (extended.getTypeParameters().size() > idx) {
								//also add more precise bindings from extensions
								resultList.add(extended.getTypeParameters().get(idx));
							}
						}
					}
				}
				if(reference != null && reference.eContainer() instanceof de.silvawb.java.references.ReflectiveClassReference) {
					if (reference.eContainer().eContainer() instanceof de.silvawb.java.references.Reference) {
						//the ".class" instantiation implicitly binds the T parameter of java.lang.Class to the class itself
						resultList.add(0, (( de.silvawb.java.references.Reference)reference.eContainer().eContainer()).getReferencedType());
					}
				}
			}
		}
		
		if (typeParameterDeclarator instanceof de.silvawb.java.members.Method) {
			if (reference instanceof de.silvawb.java.references.MethodCall) {
				de.silvawb.java.members.Method method = ( de.silvawb.java.members.Method) typeParameterDeclarator;
				de.silvawb.java.references.MethodCall methodCall = ( de.silvawb.java.references.MethodCall) reference;
				if(method.getTypeParameters().size() == methodCall.getCallTypeArguments().size()) {
					de.silvawb.java.generics.TypeArgument typeArgument = methodCall.getCallTypeArguments().get(method.getTypeParameters().indexOf(this));
					if (typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
						resultList.add(0, (( de.silvawb.java.generics.QualifiedTypeArgument)typeArgument).getTypeReference().getBoundTarget(parentReference)); 
					} 
				}
		
				//class type parameter
				int idx = method.getParameters().indexOf(typeReference.eContainer());
				
				//method type parameter
				if (idx == -1) {
					for( de.silvawb.java.parameters.Parameter parameter : method.getParameters()) {
						for ( de.silvawb.java.generics.TypeArgument typeArgument : parameter.getTypeArguments()) {
							if(typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
								if((( de.silvawb.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
									idx = method.getParameters().indexOf(parameter);
								}
							}
						}
						de.silvawb.java.types.ClassifierReference paramTypeReference = parameter.getTypeReference().getPureClassifierReference();
						if (paramTypeReference != null) {
							for ( de.silvawb.java.generics.TypeArgument typeArgument : paramTypeReference.getTypeArguments()) {
								if(typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
									if(this.equals((( de.silvawb.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget())) {
										idx = method.getParameters().indexOf(parameter);
									}
								}
							}
						}
					}
				}
				
				if (idx < methodCall.getArguments().size() && idx >= 0) {
					de.silvawb.java.expressions.Expression argument = methodCall.getArguments().get(idx);
					de.silvawb.java.parameters.Parameter parameter = method.getParameters().get(idx);
					de.silvawb.java.types.ClassifierReference parameterType = parameter.getTypeReference().getPureClassifierReference();
					if (argument instanceof de.silvawb.java.instantiations.NewConstructorCall) {
						de.silvawb.java.types.ClassifierReference argumentType = (( de.silvawb.java.instantiations.NewConstructorCall)argument).getTypeReference().getPureClassifierReference();
						if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
							for( de.silvawb.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
								if(typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
									if((( de.silvawb.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
										resultList.add(0, (( de.silvawb.java.generics.QualifiedTypeArgument)argumentType.getTypeArguments().get(parameterType.getTypeArguments().indexOf(typeArgument))).getTypeReference(
											).getTarget());
									}
								}
							}
						}
						if (argumentType != null && parameterType.getTarget() instanceof de.silvawb.java.generics.TypeParameter) {
							resultList.add(0,argumentType.getTarget());
						}
					}
					else if (parameterType != null && argument instanceof de.silvawb.java.references.Reference) {
						de.silvawb.java.references.Reference argReference = ( de.silvawb.java.references.Reference) argument;
						
						while (argReference.getNext() instanceof de.silvawb.java.references.Reference &&
								!(argReference.getNext() instanceof de.silvawb.java.references.ReflectiveClassReference) ) {
							argReference = argReference.getNext();
						}
			
						
						if (argReference instanceof de.silvawb.java.references.ElementReference) {
							de.silvawb.java.references.ElementReference elementReference = ( de.silvawb.java.references.ElementReference) argReference;
							while (elementReference.getNext() instanceof de.silvawb.java.references.ElementReference) {
								elementReference = ( de.silvawb.java.references.ElementReference) elementReference.getNext();
							}
							if (elementReference.getTarget() instanceof de.silvawb.java.types.TypedElement) {
								de.silvawb.java.types.ClassifierReference argumentType = (( de.silvawb.java.types.TypedElement)elementReference.getTarget()).getTypeReference().getPureClassifierReference();
								if (argumentType != null && parameterType.getTypeArguments().size() == argumentType.getTypeArguments().size()) {
									for( de.silvawb.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
										if(typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
											if((( de.silvawb.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
												int idx2 = parameterType.getTypeArguments().indexOf(typeArgument);
												if (argumentType.getTypeArguments().get(idx2) instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
													resultList.add(0, (( de.silvawb.java.generics.QualifiedTypeArgument)argumentType.getTypeArguments().get(idx2)).getTypeReference().getTarget());
												}
												else if (argumentType.getTypeArguments().get(idx2) instanceof de.silvawb.java.generics.ExtendsTypeArgument) {
													for( de.silvawb.java.types.TypeReference extendedType : (( de.silvawb.java.generics.ExtendsTypeArgument) argumentType.getTypeArguments().get(idx2)).getExtendTypes()) {
														resultList.add(0, extendedType.getTarget());
													}
												}
											}
										}
									}
								}
								if (argumentType != null && parameterType.getTarget() instanceof de.silvawb.java.generics.TypeParameter) {
									resultList.add(0,argumentType.getTarget());
								}
							}
							if(elementReference.getNext() instanceof de.silvawb.java.references.ReflectiveClassReference) {
								if (parameterType.getTypeArguments().size() == 1) {
									for( de.silvawb.java.generics.TypeArgument typeArgument : parameterType.getTypeArguments()) {
										if(typeArgument instanceof de.silvawb.java.generics.QualifiedTypeArgument) {
											if((( de.silvawb.java.generics.QualifiedTypeArgument) typeArgument).getTypeReference().getTarget().equals(this)) {
												resultList.add(0, elementReference.getReferencedType());
											}
										}
									}
								}
							}
						}
						else {
							if (parameterType.getTarget() instanceof de.silvawb.java.generics.TypeParameter) {
								while (argReference.getNext() instanceof de.silvawb.java.references.Reference) {
									argReference = argReference.getNext();
								}
								resultList.add(0, (( de.silvawb.java.references.Reference) argReference).getReferencedType());
							}
						}
					}			
				}
				
				//return type
				if(method.equals(typeReference.eContainer())) {
					//bound by the type of a method argument?
					org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.Classifier> allSuperTypes = null;
					for( de.silvawb.java.parameters.Parameter parameter : method.getParameters()) {
						if(this.equals(parameter.getTypeReference().getTarget())) {
							idx = method.getParameters().indexOf(parameter);
							de.silvawb.java.classifiers.Classifier argumentType = ( de.silvawb.java.classifiers.Classifier) methodCall.getArguments().get(idx).getType();
							if(allSuperTypes == null) {
								allSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.Classifier>();
								allSuperTypes.add(argumentType);
								allSuperTypes.addAll(argumentType.getAllSuperClassifiers());
							}
							else {
								allSuperTypes.add(argumentType);
								org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.Classifier> allOtherSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.Classifier>();
								allOtherSuperTypes.add(argumentType);
								allOtherSuperTypes.addAll(argumentType.getAllSuperClassifiers());
								org.eclipse.emf.common.util.EList< de.silvawb.java.classifiers.Classifier> temp = allSuperTypes;
								allSuperTypes = new org.emftext.language.java.util.UniqueEList< de.silvawb.java.classifiers.Classifier>();
								for( de.silvawb.java.classifiers.Classifier st : allOtherSuperTypes) {
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
			for( de.silvawb.java.types.Type aResult : resultList) {
				if(aResult instanceof de.silvawb.java.types.PrimitiveType) {
					aResult = (( de.silvawb.java.types.PrimitiveType) aResult).wrapPrimitiveType();
				}
				
				if (aResult instanceof org.emftext.language.java.util.TemporalCompositeClassifier) {
					//flatten
					temp.getSuperTypes().addAll((( org.emftext.language.java.util.TemporalCompositeClassifier)aResult).getSuperTypes());
				}
				else {
					temp.getSuperTypes().add(( de.silvawb.java.classifiers.Classifier) aResult);	
				}
			}
			temp.getSuperTypes().add(this);
			return (Type) temp;
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
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
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
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
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
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
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
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
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
			case GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES:
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
				case TypesPackage.TYPE___GET_ALL_MEMBERS__COMMENTABLE: return GenericsPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseOperationID) {
				case ClassifiersPackage.CLASSIFIER___GET_ALL_SUPER_CLASSIFIERS: return GenericsPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS;
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
			case GenericsPackage.TYPE_PARAMETER___GET_ALL_SUPER_CLASSIFIERS:
				return getAllSuperClassifiers();
			case GenericsPackage.TYPE_PARAMETER___GET_ALL_MEMBERS__COMMENTABLE:
				return getAllMembers((Commentable)arguments.get(0));
			case GenericsPackage.TYPE_PARAMETER___GET_BOUND_TYPE__TYPEREFERENCE_REFERENCE:
				return getBoundType((TypeReference)arguments.get(0), (Reference)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeParameterImpl
