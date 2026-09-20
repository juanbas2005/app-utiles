.class public final Lde;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lje;


# direct methods
.method public synthetic constructor <init>(Lje;I)V
    .locals 0

    .line 1
    iput p2, p0, Lde;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Lde;->y:Lje;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lde;->x:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lde;->y:Lje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lqy0;

    .line 11
    .line 12
    invoke-virtual {p0}, Lje;->getPointerIconService()Lpk5;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    check-cast p1, Lqy0;

    .line 18
    .line 19
    invoke-virtual {p0}, Lje;->getTextToolbar()Lug7;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    check-cast p1, Lqy0;

    .line 25
    .line 26
    invoke-virtual {p0}, Lje;->getSoftwareKeyboardController()Lgy6;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    check-cast p1, Lqy0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lje;->getTextInputService()Lrf7;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_3
    check-cast p1, Lqy0;

    .line 39
    .line 40
    invoke-virtual {p0}, Lje;->getInputModeManager()Ltc3;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_4
    check-cast p1, Lo81;

    .line 46
    .line 47
    new-instance v0, Lmh;

    .line 48
    .line 49
    invoke-virtual {p0}, Lje;->getTextInputService()Lrf7;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, p0, v1, p1}, Lmh;-><init>(Landroid/view/View;Lrf7;Lo81;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_5
    check-cast p1, Lsr2;

    .line 58
    .line 59
    invoke-virtual {p0}, Lje;->getUncaughtExceptionHandler$ui()Lc96;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/4 v0, 0x0

    .line 74
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v0, v2, :cond_1

    .line 79
    .line 80
    invoke-interface {p1}, Lsr2;->b()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_2

    .line 89
    .line 90
    new-instance v0, Lvd;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {v0, v2, p1}, Lvd;-><init>(ILsr2;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    return-object v1

    .line 100
    :pswitch_6
    check-cast p1, Lbk2;

    .line 101
    .line 102
    iget p1, p1, Lbk2;->a:I

    .line 103
    .line 104
    invoke-virtual {p0}, Lje;->getFocusOwner()Lik2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const/4 v0, 0x0

    .line 109
    check-cast p0, Llk2;

    .line 110
    .line 111
    invoke-virtual {p0, p1, v0}, Llk2;->h(IZ)Z

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
