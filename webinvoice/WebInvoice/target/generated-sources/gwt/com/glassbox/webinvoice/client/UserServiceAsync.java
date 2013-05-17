package com.glassbox.webinvoice.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface UserServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.glassbox.webinvoice.client.UserService
     */
    void rigesterUser( java.lang.String firstName, java.lang.String lastName, java.lang.String[] emails, java.lang.String password, com.glassbox.webinvoice.shared.entity.AuState state, int postCode, java.lang.String suburb, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.glassbox.webinvoice.client.UserService
     */
    void findUser( java.lang.String email, java.lang.String password, AsyncCallback<com.glassbox.webinvoice.shared.DTOentity.PersonDTO> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static UserServiceAsync instance;

        public static final UserServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (UserServiceAsync) GWT.create( UserService.class );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
