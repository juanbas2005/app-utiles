.class public abstract Lhr6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lpp5;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpp5;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lj44;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lj44;-><init>(Lsr2;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lvq6;Lyt2;)Lpq6;
    .locals 6

    .line 1
    sget-object v0, Lch4;->b:Lt37;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lzg4;

    .line 8
    .line 9
    iget-object p1, p1, Lzg4;->c:Lgr6;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    packed-switch p0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lh;->c()V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object p0, p1, Lgr6;->b:Lo96;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    sget-object p0, Lgr8;->h:Lm23;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    iget-object p0, p1, Lgr6;->c:Lo96;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    iget-object p0, p1, Lgr6;->d:Lo96;

    .line 33
    .line 34
    invoke-static {p0}, Lhr6;->b(Lo96;)Lo96;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_4
    iget-object v0, p1, Lgr6;->d:Lo96;

    .line 40
    .line 41
    sget-object v2, Luq6;->i:Lmx1;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/16 v5, 0x9

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    move-object v3, v2

    .line 48
    invoke-static/range {v0 .. v5}, Lo96;->c(Lo96;La81;La81;La81;La81;I)Lo96;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_5
    iget-object p0, p1, Lgr6;->f:Lo96;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_6
    iget-object v0, p1, Lgr6;->d:Lo96;

    .line 57
    .line 58
    sget-object v1, Luq6;->i:Lmx1;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v5, 0x6

    .line 62
    const/4 v2, 0x0

    .line 63
    move-object v4, v1

    .line 64
    invoke-static/range {v0 .. v5}, Lo96;->c(Lo96;La81;La81;La81;La81;I)Lo96;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_7
    iget-object p0, p1, Lgr6;->d:Lo96;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_8
    sget-object p0, Lq96;->a:Lo96;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_9
    iget-object p0, p1, Lgr6;->a:Lo96;

    .line 76
    .line 77
    invoke-static {p0}, Lhr6;->b(Lo96;)Lo96;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_a
    iget-object p0, p1, Lgr6;->a:Lo96;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_b
    iget-object p0, p1, Lgr6;->e:Lo96;

    .line 86
    .line 87
    invoke-static {p0}, Lhr6;->b(Lo96;)Lo96;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :pswitch_c
    iget-object p0, p1, Lgr6;->g:Lo96;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_d
    iget-object p0, p1, Lgr6;->e:Lo96;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_e
    iget-object p0, p1, Lgr6;->h:Lo96;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
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
.end method

.method public static b(Lo96;)Lo96;
    .locals 6

    .line 1
    sget-object v3, Luq6;->i:Lmx1;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v5, 0x3

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v4, v3

    .line 7
    move-object v0, p0

    .line 8
    invoke-static/range {v0 .. v5}, Lo96;->c(Lo96;La81;La81;La81;La81;I)Lo96;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.end method
