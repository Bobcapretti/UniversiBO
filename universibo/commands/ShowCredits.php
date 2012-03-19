<?php

require_once ('UniversiboCommand'.PHP_EXTENSION);

/**
 * ShowCredits is an extension of UniversiboCommand class.
 *
 * It shows Credits page
 *
 * @package universibo
 * @subpackage commands
 * @version 2.0.0
 * @author Fabrizio Pinto
 * @author Ilias Bartolini <brain79@virgilio.it>
 * @license GPL, {@link http://www.opensource.org/licenses/gpl-license.php}
 */
 
class ShowCredits extends UniversiboCommand {
	function execute(){

		$frontcontroller = $this->getFrontController();
		$template = $frontcontroller->getTemplateEngine();
		
		$template->assign('showCredits_langTitleAlt','Credits');
		$template->assign('showCredits_langIntro','Questo sito � stato realizzato e funziona utilizzando internamente solo software libero e open source e appoggiandosi alle strutture rese disponibili dall\'Ateneo');
		$template->assign('showCredits_langSO','Il sistema operativo su cui si appoggia il nostro server � GNU/Linux di cui abbiamo scelto la distribuzione Slackware
[url=http://www.slackware.org]www.slackware.org[/url]');
		$template->assign('showCredits_langApache','Il programma di web server utilizzato � il diffusissimo Apache Web Server e per mantenere la massima sicurezza dei dati inviati viene utilizzato il protocollo HTTPS/SSL 
[url=http://www.apache.org]www.apache.org[/url]');
		$template->assign('showCredits_langPostgres','Come database server locale per il mantenimento e trattamento dei dati viene utilizzato PostgreSQL
[url=http://www.postgresql.org]www.postgresql.org[/url]');
		$template->assign('showCredits_langPhp','Il motore utilizzato per creare e scrivere le pagine di questo sito � basato su PHP 5.3.x, il codice sorgente di queste pagine � scritto da studenti volontari ed � disponibile con licenza GPL.
[url=http://www.php.net]www.php.net[/url]');
		$template->assign('showCredits_langPhpAccelerator','Per ottenere il massimo delle prestazioni viene utilizzato migliorare le prestazioni si � utilizzato il sistema di caching PHP Accelerator.
[url=http://www.php-accelerator.co.uk/]http://www.php-accelerator.co.uk/[/url]');
		$template->assign('showCredits_langSmarty','Si � utilizzato il template engine Smarty per scindere la presentazione delle informazioni dalla logica applicativa.
[url=http://www.smarty.net]www.smarty.net[/url]');

		$template->assign('showCredits_langOthers','In queste pagine abbiamo integrato ed utilizzato tantissimi componenti e moduli PHP frutto delle comunit� Open Source.
Da Pear vengono utilizzati i package DB come database abstraction layer, SOAP per i web services e PhpDocumentor per generare la documentazione
[url=http://pear.php.net]http://pear.php.net[/url]
PHPMailer per la gestione del servizio e-mail
[url=http://phpmailer.sourceforge.net]phpmailer.sourceforge.net[/url]
Il forum � basato su PHPBB a cui sono state apportate piccole modifiche
[url=http://www.phpbb.com]www.phpbb.com[/url]');
		$template->assign('showCredits_langW3c','Le pagine sono create nell\'intento di rispettare gli standard pi� diffusi e di permettere la maggiore accessibilit� possibile per tutti.
[url=http://www.w3c.org]www.w3c.org[/url]');
				
		return 'default';						
	}
}

