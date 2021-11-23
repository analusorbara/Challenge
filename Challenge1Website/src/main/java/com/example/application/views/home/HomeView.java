package com.example.application.views.home;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

@PWA(name = "Challenge1", shortName = "Challenge1", enableInstallPrompt = false)
@Theme(themeFolder = "challenge1")
@PageTitle("Home")
@Route(value = "home")
@RouteAlias(value = "")

public class HomeView extends VerticalLayout {

       public HomeView() {

        FormLayout form = new FormLayout();

        H1 titulo = new H1("World Clock API");
        form.add(titulo);
        form.setColspan(titulo, 2);

       ComboBox<AvaliableTimeZone> comboBox = new ComboBox<>("Time Zone");
       comboBox.setItems(AvaliableTimeZone.values());
       comboBox.setItemLabelGenerator(AvaliableTimeZone::toString);


       Button btnSearch = new Button("Search");
       VerticalLayout containerForm = new VerticalLayout(comboBox,btnSearch);
       form.add(containerForm);

       Div container = new Div();
       container.setMinWidth("50%");
       container.add(new H2("Time Zone result"));
       add(form, container);

       H2 result = new H2();
       result.setVisible(false);
       container.add(result);

       result.setVisible(false);

       btnSearch.addClickListener(buttonClickEvent ->{
           ObjectMapper mapper = new ObjectMapper();

           OkHttpClient client = new OkHttpClient();


               Request request = new Request.Builder()
                       .url("http://worldclockapi.com/api/json/"+comboBox.getValue().toString()+"/now")

                       .build(); // defaults to GET

                   Response response = null;
                   try {
                       response = client.newCall(request).execute();

                       ApiResponse resultApi = mapper.readValue(response.body().byteStream(), ApiResponse.class);

                       if(resultApi.getCurrentDateTime() != null) {
                           result.setVisible(true);
                           result.setText(resultApi.getCurrentDateTime());
                       }else{
                           result.setVisible(true);
                           result.setText("Time Zone not found");
                       }

                   } catch (IOException e) {
                       e.printStackTrace();
                   }



       }
       );


    }

}
