// Code generated by dagger-compiler.  Do not edit.
package com.example.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<MainActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code MainActivity} and its
 * dependencies.
 *
 * Being a {@code Provider<MainActivity>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<MainActivity>} and handling injection
 * of annotated fields.
 */
public final class MainActivity$$InjectAdapter extends Binding<MainActivity>
    implements Provider<MainActivity>, MembersInjector<MainActivity> {
  private Binding<AppContainer> appContainer;
  private Binding<com.example.ui.misc.BaseActivity> supertype;

  public MainActivity$$InjectAdapter() {
    super("com.example.ui.MainActivity", "members/com.example.ui.MainActivity", NOT_SINGLETON, MainActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    appContainer = (Binding<AppContainer>) linker.requestBinding("com.example.ui.AppContainer", MainActivity.class, getClass().getClassLoader());
    supertype = (Binding<com.example.ui.misc.BaseActivity>) linker.requestBinding("members/com.example.ui.misc.BaseActivity", MainActivity.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(appContainer);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<MainActivity>}.
   */
  @Override
  public MainActivity get() {
    MainActivity result = new MainActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<MainActivity>}.
   */
  @Override
  public void injectMembers(MainActivity object) {
    object.appContainer = appContainer.get();
    supertype.injectMembers(object);
  }

}