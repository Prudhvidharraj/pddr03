---
- hosts: pddrserver
  root_user: root
  become: yes
  vars_files:
      -abc.yml
    tasks:
     - name: pddr install httpd
       yum: name={{pkg}} state=started
     - name: copy index.html
       copy: scr=index.html dest=/var/www/html
     - name: service httpd start
       service: name={{pkg}} state=started
