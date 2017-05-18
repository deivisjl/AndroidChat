package edu.galileo.android.androidchat.contactlist;

/**
 * Created by Usuario_Privado on 05/08/2016.
 */
public class ContactListInteractorImpl implements ContactListInteractor {
    ContactListRepository repository;

    public ContactListInteractorImpl() {
        repository = new ContactListRepositoryImpl();
    }

    @Override
    public void subscribe() {
        repository.subscribeToContactLIstEvents();
    }

    @Override
    public void unsubscribe() {
        repository.unsubsuscribeToContactListEvents();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }

    @Override
    public void removeContact(String email) {
        repository.removerContact(email);
    }
}
