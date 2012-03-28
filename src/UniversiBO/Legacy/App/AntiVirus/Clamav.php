<?php
namespace UniversiBO\Legacy\App\AntiVirus;

/**
 * Classe antivirus per clamav
 *
 * @package universibo
 * @author Ilias Bartolini <brain79@virgilio.it>
 * @license GPL, http://www.opensource.org/licenses/gpl-license.php
 * @copyright CopyLeft UniversiBO 2001-2005
 */

class Clamav
{
	
	var $opts = '';
	
	var $cmd  = '';
	
	public function __construct($cmd, $opts){
		$this->cmd = $cmd;
		$this->opts = $opts;
	}

	/**
	 * @return true se ci sono virus, false se _non_ ci sono virus
	 */
	function checkFile($filename)
	{
		$filename = escapeshellarg($filename);
		
		$fullCommand =  $this->cmd.' '.$this->opts.' '.$filename;
		
		$output = array();
		unset($output);
		$returnval = null;
		
		exec ( $fullCommand, $output, $returnval );
		//var_dump($returnval);
		//var_dump($fullCommand);
		
		if ($returnval == 1) return true;
		if ($returnval == 0) return false;
		
	}	
}