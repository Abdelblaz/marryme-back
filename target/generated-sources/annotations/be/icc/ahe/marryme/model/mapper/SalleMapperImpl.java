package be.icc.ahe.marryme.model.mapper;

import be.icc.ahe.marryme.dataaccess.entity.AddressEntity;
import be.icc.ahe.marryme.dataaccess.entity.FermetureEntity;
import be.icc.ahe.marryme.dataaccess.entity.FormuleEntity;
import be.icc.ahe.marryme.dataaccess.entity.ImageEntity;
import be.icc.ahe.marryme.dataaccess.entity.PersonEntity;
import be.icc.ahe.marryme.dataaccess.entity.SalleEntity;
import be.icc.ahe.marryme.dataaccess.entity.SocieteEntity;
import be.icc.ahe.marryme.model.Address;
import be.icc.ahe.marryme.model.Fermeture;
import be.icc.ahe.marryme.model.Formule;
import be.icc.ahe.marryme.model.Image;
import be.icc.ahe.marryme.model.Person;
import be.icc.ahe.marryme.model.Salle;
import be.icc.ahe.marryme.model.Societe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-15T01:15:47+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.8 (Oracle Corporation)"
)
public class SalleMapperImpl implements SalleMapper {

    @Override
    public SalleEntity entityToModel(Salle salle) {
        if ( salle == null ) {
            return null;
        }

        SalleEntity salleEntity = new SalleEntity();

        salleEntity.setServiceID( salle.getServiceID() );
        salleEntity.setNom( salle.getNom() );
        salleEntity.setSociete( societeToSocieteEntity( salle.getSociete() ) );
        salleEntity.setFermetures( fermetureCollectionToFermetureEntityCollection( salle.getFermetures() ) );
        salleEntity.setImage( imageToImageEntity( salle.getImage() ) );
        salleEntity.setCapaciteTotal( salle.getCapaciteTotal() );
        salleEntity.setPlaceAssise( salle.getPlaceAssise() );
        salleEntity.setPisteDance( salle.getPisteDance() );
        salleEntity.setDecoration( salle.getDecoration() );
        salleEntity.setMaterielMusique( salle.getMaterielMusique() );
        salleEntity.setTraiteur( salle.getTraiteur() );
        salleEntity.setCuisine( salle.getCuisine() );
        salleEntity.setIsExternal( salle.getIsExternal() );
        salleEntity.setHallTypeEntity( salle.getHallTypeEntity() );
        salleEntity.setHaveParking( salle.getHaveParking() );

        return salleEntity;
    }

    @Override
    public Salle modelToEntity(SalleEntity salleEntity) {
        if ( salleEntity == null ) {
            return null;
        }

        Salle salle = new Salle();

        salle.setServiceID( salleEntity.getServiceID() );
        salle.setNom( salleEntity.getNom() );
        salle.setSociete( societeEntityToSociete( salleEntity.getSociete() ) );
        salle.setFermetures( fermetureEntityCollectionToFermetureCollection( salleEntity.getFermetures() ) );
        salle.setImage( imageEntityToImage( salleEntity.getImage() ) );
        salle.setCapaciteTotal( salleEntity.getCapaciteTotal() );
        salle.setPlaceAssise( salleEntity.getPlaceAssise() );
        salle.setPisteDance( salleEntity.getPisteDance() );
        salle.setDecoration( salleEntity.getDecoration() );
        salle.setMaterielMusique( salleEntity.getMaterielMusique() );
        salle.setTraiteur( salleEntity.getTraiteur() );
        salle.setCuisine( salleEntity.getCuisine() );
        salle.setIsExternal( salleEntity.getIsExternal() );
        salle.setHallTypeEntity( salleEntity.getHallTypeEntity() );
        salle.setHaveParking( salleEntity.getHaveParking() );

        return salle;
    }

    protected AddressEntity addressToAddressEntity(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setAdressID( address.getAdressID() );
        addressEntity.setPays( address.getPays() );
        addressEntity.setVille( address.getVille() );
        addressEntity.setCodePostal( address.getCodePostal() );
        addressEntity.setRue( address.getRue() );
        addressEntity.setNumero( address.getNumero() );
        addressEntity.setBox( address.getBox() );

        return addressEntity;
    }

    protected PersonEntity personToPersonEntity(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setPersonID( person.getPersonID() );
        personEntity.setFirstName( person.getFirstName() );
        personEntity.setLastName( person.getLastName() );
        personEntity.setPhoneNbr( person.getPhoneNbr() );
        personEntity.setLocalisation( addressToAddressEntity( person.getLocalisation() ) );

        return personEntity;
    }

    protected SocieteEntity societeToSocieteEntity(Societe societe) {
        if ( societe == null ) {
            return null;
        }

        SocieteEntity societeEntity = new SocieteEntity();

        societeEntity.setSocieteID( societe.getSocieteID() );
        societeEntity.setNTVA( societe.getNTVA() );
        societeEntity.setNEntreprise( societe.getNEntreprise() );
        societeEntity.setNom( societe.getNom() );
        societeEntity.setEmail( societe.getEmail() );
        societeEntity.setNTel( societe.getNTel() );
        societeEntity.setLocalisation( addressToAddressEntity( societe.getLocalisation() ) );
        societeEntity.setOwner( personToPersonEntity( societe.getOwner() ) );

        return societeEntity;
    }

    protected FermetureEntity fermetureToFermetureEntity(Fermeture fermeture) {
        if ( fermeture == null ) {
            return null;
        }

        FermetureEntity fermetureEntity = new FermetureEntity();

        fermetureEntity.setId( fermeture.getId() );
        fermetureEntity.setDate( fermeture.getDate() );

        return fermetureEntity;
    }

    protected Collection<FermetureEntity> fermetureCollectionToFermetureEntityCollection(Collection<Fermeture> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<FermetureEntity> collection1 = new ArrayList<FermetureEntity>( collection.size() );
        for ( Fermeture fermeture : collection ) {
            collection1.add( fermetureToFermetureEntity( fermeture ) );
        }

        return collection1;
    }

    protected List<ImageEntity> imageListToImageEntityList(List<Image> list) {
        if ( list == null ) {
            return null;
        }

        List<ImageEntity> list1 = new ArrayList<ImageEntity>( list.size() );
        for ( Image image : list ) {
            list1.add( imageToImageEntity( image ) );
        }

        return list1;
    }

    protected FormuleEntity formuleToFormuleEntity(Formule formule) {
        if ( formule == null ) {
            return null;
        }

        FormuleEntity formuleEntity = new FormuleEntity();

        formuleEntity.setFormuleID( formule.getFormuleID() );
        formuleEntity.setNom( formule.getNom() );
        formuleEntity.setPrix( formule.getPrix() );
        formuleEntity.setDescription( formule.getDescription() );
        formuleEntity.setIsUniquePrix( formule.getIsUniquePrix() );
        formuleEntity.setSupFerrier( formule.getSupFerrier() );
        formuleEntity.setSupvendredi( formule.getSupvendredi() );
        formuleEntity.setCodePostal( formule.getCodePostal() );
        formuleEntity.setSupDimanche( formule.getSupDimanche() );
        formuleEntity.setSupVeilleFerier( formule.getSupVeilleFerier() );
        formuleEntity.setImages( imageListToImageEntityList( formule.getImages() ) );

        return formuleEntity;
    }

    protected ImageEntity imageToImageEntity(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageEntity imageEntity = new ImageEntity();

        imageEntity.setImageID( image.getImageID() );
        byte[] photo = image.getPhoto();
        if ( photo != null ) {
            imageEntity.setPhoto( Arrays.copyOf( photo, photo.length ) );
        }
        imageEntity.setFormule( formuleToFormuleEntity( image.getFormule() ) );

        return imageEntity;
    }

    protected Address addressEntityToAddress(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        Address address = new Address();

        address.setAdressID( addressEntity.getAdressID() );
        address.setPays( addressEntity.getPays() );
        address.setVille( addressEntity.getVille() );
        address.setCodePostal( addressEntity.getCodePostal() );
        address.setRue( addressEntity.getRue() );
        address.setNumero( addressEntity.getNumero() );
        address.setBox( addressEntity.getBox() );

        return address;
    }

    protected Person personEntityToPerson(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        Person person = new Person();

        person.setPersonID( personEntity.getPersonID() );
        person.setFirstName( personEntity.getFirstName() );
        person.setLastName( personEntity.getLastName() );
        person.setPhoneNbr( personEntity.getPhoneNbr() );
        person.setLocalisation( addressEntityToAddress( personEntity.getLocalisation() ) );

        return person;
    }

    protected Societe societeEntityToSociete(SocieteEntity societeEntity) {
        if ( societeEntity == null ) {
            return null;
        }

        Societe societe = new Societe();

        societe.setSocieteID( societeEntity.getSocieteID() );
        societe.setNTVA( societeEntity.getNTVA() );
        societe.setNEntreprise( societeEntity.getNEntreprise() );
        societe.setNom( societeEntity.getNom() );
        societe.setEmail( societeEntity.getEmail() );
        societe.setNTel( societeEntity.getNTel() );
        societe.setLocalisation( addressEntityToAddress( societeEntity.getLocalisation() ) );
        societe.setOwner( personEntityToPerson( societeEntity.getOwner() ) );

        return societe;
    }

    protected Fermeture fermetureEntityToFermeture(FermetureEntity fermetureEntity) {
        if ( fermetureEntity == null ) {
            return null;
        }

        Fermeture fermeture = new Fermeture();

        fermeture.setId( fermetureEntity.getId() );
        fermeture.setDate( fermetureEntity.getDate() );

        return fermeture;
    }

    protected Collection<Fermeture> fermetureEntityCollectionToFermetureCollection(Collection<FermetureEntity> collection) {
        if ( collection == null ) {
            return null;
        }

        Collection<Fermeture> collection1 = new ArrayList<Fermeture>( collection.size() );
        for ( FermetureEntity fermetureEntity : collection ) {
            collection1.add( fermetureEntityToFermeture( fermetureEntity ) );
        }

        return collection1;
    }

    protected List<Image> imageEntityListToImageList(List<ImageEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Image> list1 = new ArrayList<Image>( list.size() );
        for ( ImageEntity imageEntity : list ) {
            list1.add( imageEntityToImage( imageEntity ) );
        }

        return list1;
    }

    protected Formule formuleEntityToFormule(FormuleEntity formuleEntity) {
        if ( formuleEntity == null ) {
            return null;
        }

        Formule formule = new Formule();

        formule.setFormuleID( formuleEntity.getFormuleID() );
        formule.setNom( formuleEntity.getNom() );
        formule.setPrix( formuleEntity.getPrix() );
        formule.setDescription( formuleEntity.getDescription() );
        formule.setIsUniquePrix( formuleEntity.getIsUniquePrix() );
        formule.setSupFerrier( formuleEntity.getSupFerrier() );
        formule.setSupvendredi( formuleEntity.getSupvendredi() );
        formule.setCodePostal( formuleEntity.getCodePostal() );
        formule.setSupDimanche( formuleEntity.getSupDimanche() );
        formule.setSupVeilleFerier( formuleEntity.getSupVeilleFerier() );
        formule.setImages( imageEntityListToImageList( formuleEntity.getImages() ) );

        return formule;
    }

    protected Image imageEntityToImage(ImageEntity imageEntity) {
        if ( imageEntity == null ) {
            return null;
        }

        Image image = new Image();

        image.setImageID( imageEntity.getImageID() );
        byte[] photo = imageEntity.getPhoto();
        if ( photo != null ) {
            image.setPhoto( Arrays.copyOf( photo, photo.length ) );
        }
        image.setFormule( formuleEntityToFormule( imageEntity.getFormule() ) );

        return image;
    }
}
