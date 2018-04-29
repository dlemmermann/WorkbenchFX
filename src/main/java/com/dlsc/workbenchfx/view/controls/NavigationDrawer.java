package com.dlsc.workbenchfx.view.controls;

import com.dlsc.workbenchfx.WorkbenchFx;
import java.util.Objects;
import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Skin;

/** Created by lemmi on 22.08.17. */
public class NavigationDrawer extends Control {

  private final ObservableList<MenuItem> items;
  private WorkbenchFx workbench;

  public NavigationDrawer(WorkbenchFx workbench) {
    this.workbench = Objects.requireNonNull(workbench);

    getStyleClass().add("navigation-drawer");

    items = workbench.getNavigationDrawerItems();
  }

  @Override
  protected Skin<?> createDefaultSkin() {
    return new NavigationDrawerSkin(this);
  }

  public WorkbenchFx getWorkbench() {
    return workbench;
  }

  public final ObservableList<MenuItem> getItems() {
    return items;
  }
}
