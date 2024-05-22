package be.pxl.paj.servlets;

import be.pxl.paj.servlets.domain.PhoneBookEntry;
import be.pxl.paj.servlets.repository.PhoneBookEntryRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/AddPhonebookEntry")
public class AddPhoneBookEntryServlet extends HttpServlet {
    private final PhoneBookEntryRepository phoneBookEntryRepository;

    public AddPhoneBookEntryServlet(PhoneBookEntryRepository phoneBookEntryRepository) {
        this.phoneBookEntryRepository = phoneBookEntryRepository;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phoneNumber = req.getParameter("phoneNumber");

        phoneBookEntryRepository.save(new PhoneBookEntry(phoneNumber, firstName, lastName));

        PrintWriter out = resp.getWriter();
        out.println("<html>" +
                "<body>" +
                "<p>Phonenumber " + phoneNumber + " added</p>" +
                "<a href=\"phonebook_add.html\">Exercise: phonebook</a>" +
                "<div><a href=\"/display_phonebook_entries\">All phonebook entries</a></div>" +
                "</body>" +
                "</html>");
    }
}
