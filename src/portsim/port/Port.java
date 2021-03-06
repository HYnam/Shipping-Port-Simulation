package portsim.port;

import portsim.cargo.Cargo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** A place where ships can come and dock with Quays to load / unload their cargo.
 * Cargo is stored within the port.
 * */
public class Port extends Object {
    /** name of the port */
    private String nameOfPort;

    /** Quay to be added*/
    private List<Quay> quaysList;

    /** Cargo in port is an empty list */
    private List<Cargo> cargosInPort;

    /** Creates a new port with the given name.
     * The list of quays in the port and stored cargo should be initialised as empty lists.
     * @param name - name of the port, String type
     * */
    public Port(String name) {
        this.nameOfPort = name;
        this.quaysList = new ArrayList<Quay>();
        this.cargosInPort = new ArrayList<Cargo>();
    }

    /** Returns the name of this port.
     * @return port's name, String type
     * */
    public String getName() {
        return this.nameOfPort;
    }

    /** Returns a list of all quays associated with this port.
     * Adding or removing elements from the returned list should not affect the original list.
     *
     * The order in which quays appear in this list should be the
     * same as the order in which they were added by calling addQuay(Quay).
     *
     * @return all quays, List type
     * */
    public List<Quay> getQuays() {
        // Declare a list called quays to store all the quays
        List<Quay> result = new LinkedList<>(this.quaysList); //Thus creating a deep copy.
        return result;
    }

    /** Returns the cargo stored at this port.
     *  Adding or removing elements from the returned list should not affect the original list.
     *  @return port cargo, List type
     * */
    public List<Cargo> getCargo() {
        List<Cargo> cargosList = new LinkedList<>(this.cargosInPort);
        return cargosList;
    }

    /** Adds a quay to the ports control
     * @param quay - the quay to add
     * */
    public void addQuay(Quay quay) {
        this.quaysList.add(quay);
    }
}
