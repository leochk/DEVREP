/**
 */
package turtle.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import turtle.util.TurtleAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtleItemProviderAdapterFactory extends TurtleAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Turtle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurtleItemProvider turtleItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Turtle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTurtleAdapter() {
		if (turtleItemProvider == null) {
			turtleItemProvider = new TurtleItemProvider(this);
		}

		return turtleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Forward} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForwardItemProvider forwardItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Forward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForwardAdapter() {
		if (forwardItemProvider == null) {
			forwardItemProvider = new ForwardItemProvider(this);
		}

		return forwardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Choreography} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyItemProvider choreographyItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Choreography}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoreographyAdapter() {
		if (choreographyItemProvider == null) {
			choreographyItemProvider = new ChoreographyItemProvider(this);
		}

		return choreographyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Farm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FarmItemProvider farmItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Farm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFarmAdapter() {
		if (farmItemProvider == null) {
			farmItemProvider = new FarmItemProvider(this);
		}

		return farmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Rotate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateItemProvider rotateItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Rotate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotateAdapter() {
		if (rotateItemProvider == null) {
			rotateItemProvider = new RotateItemProvider(this);
		}

		return rotateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.SetPen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPenItemProvider setPenItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.SetPen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetPenAdapter() {
		if (setPenItemProvider == null) {
			setPenItemProvider = new SetPenItemProvider(this);
		}

		return setPenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Stage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageItemProvider stageItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStageAdapter() {
		if (stageItemProvider == null) {
			stageItemProvider = new StageItemProvider(this);
		}

		return stageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.Color} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorItemProvider colorItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorAdapter() {
		if (colorItemProvider == null) {
			colorItemProvider = new ColorItemProvider(this);
		}

		return colorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.ColouredTurtle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColouredTurtleItemProvider colouredTurtleItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.ColouredTurtle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColouredTurtleAdapter() {
		if (colouredTurtleItemProvider == null) {
			colouredTurtleItemProvider = new ColouredTurtleItemProvider(this);
		}

		return colouredTurtleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link turtle.ColouredEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColouredEntityItemProvider colouredEntityItemProvider;

	/**
	 * This creates an adapter for a {@link turtle.ColouredEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColouredEntityAdapter() {
		if (colouredEntityItemProvider == null) {
			colouredEntityItemProvider = new ColouredEntityItemProvider(this);
		}

		return colouredEntityItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (turtleItemProvider != null) turtleItemProvider.dispose();
		if (forwardItemProvider != null) forwardItemProvider.dispose();
		if (choreographyItemProvider != null) choreographyItemProvider.dispose();
		if (farmItemProvider != null) farmItemProvider.dispose();
		if (rotateItemProvider != null) rotateItemProvider.dispose();
		if (setPenItemProvider != null) setPenItemProvider.dispose();
		if (stageItemProvider != null) stageItemProvider.dispose();
		if (colorItemProvider != null) colorItemProvider.dispose();
		if (colouredTurtleItemProvider != null) colouredTurtleItemProvider.dispose();
		if (colouredEntityItemProvider != null) colouredEntityItemProvider.dispose();
	}

}
