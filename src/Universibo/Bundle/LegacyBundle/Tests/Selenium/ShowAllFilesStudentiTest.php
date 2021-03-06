<?php
namespace Universibo\Bundle\LegacyBundle\Tests\Selenium;

use Universibo\Bundle\LegacyBundle\Tests\TestConstants;

class ShowAllFilesStudentiTest extends UniversiBOSeleniumTestCase
{
    protected function setUp()
    {
        parent::setUp();
    }

    /**
     * @dataProvider provider
     */
    public function testOrder($order, $orderSentence)
    {
        $this->login(TestConstants::ADMIN_USERNAME);
        $this->openPrefix('/file/studenti/?order='.$order);
        $this->assertSentences(array(
                'Tutti i Files Studenti presenti su UniversiBO',
                'ordinati per '.$orderSentence
        ));
    }

    public function provider()
    {
        return array (
                array(0, 'nome'),
                array(1, 'data di inserimento'),
                array(2, 'voto medio'),
        );
    }
}
