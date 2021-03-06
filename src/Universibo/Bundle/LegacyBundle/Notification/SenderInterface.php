<?php
namespace Universibo\Bundle\LegacyBundle\Notification;

use InvalidArgumentException;
use Universibo\Bundle\LegacyBundle\Entity\Notifica\NotificaItem;

/**
 * Notification sender interface
 *
 * @author Davide Bellettini <davide.bellettini@gmail.com>
 */
interface SenderInterface
{
    /**
     * Sends a notification
     *
     * @throws InvalidArgumentException if supports return false
     * @param  NotificaItem             $notification
     */
    public function send(NotificaItem $notification);

    /**
     * Tells if the sender supports a protocol
     * @param NotificaItem $notification
     */
    public function supports(NotificaItem $notification);
}
