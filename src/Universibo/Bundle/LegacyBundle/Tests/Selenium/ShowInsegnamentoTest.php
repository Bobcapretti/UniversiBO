<?php
namespace Universibo\Bundle\LegacyBundle\Tests\Selenium;

class ShowInsegnamentoTest extends UniversiBOSeleniumTestCase
{
    protected function setUp()
    {
        parent::setUp();
    }

    public function testSimple()
    {
        $sentences = array (
                'INSEGNAMENTO DI ANALISI MATEMATICA T-1 aa. 2011/2012 OBRECHT ENRICO',
        );

        $this->openCommand('ShowInsegnamento','&id_canale=10271');
        $this->assertSentences($sentences);
    }
}