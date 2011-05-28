package com.soebes.maven.plugins;

import java.io.File;
import java.net.URL;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.project.MavenProject;
import org.codehaus.cargo.container.installer.ZipURLInstaller;

/**
 * @author Karl Heinz Marbaise
 *
 * @goal download
 * @requiresProject
 */
public class DownloadMojo extends AbstractMojo {

    /**
     * The maven project.
     *
     * @parameter expression="${project}"
     * @readonly
     */
    private MavenProject project;

    /**
     * @parameter
     * @required
     */
    private URL url;
    /**
     * @parameter default-value="${project.build.directory}/downloads/"
     */
    private File downloadDir;
    /**
     * @parameter default-value="${project.build.directory}/installations/"
     */
    private File extractDir;

    public void execute() {
        getLog().info("downloadDir:" + downloadDir.getAbsolutePath());
        getLog().info("extractDir:" + extractDir.getAbsolutePath());
        getLog().info("URL:" + url.toString());
        ZipURLInstaller installer = new ZipURLInstaller(url, downloadDir.getAbsolutePath(), extractDir.getAbsolutePath());
//        installer.setFileHandler(fileHandler)
//        installer.setLogger(getLog());
//        project.getProperties().
        installer.install();
    }
}
