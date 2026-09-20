.class public final Lwq5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwq5;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lwq5;->x:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
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
.method public final b()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwq5;->w:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x2e

    .line 8
    .line 9
    iget-object p0, p0, Lwq5;->x:Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v5, Ln27;->k:Lup2;

    .line 20
    .line 21
    iget-object v5, v5, Lup2;->a:Lvp2;

    .line 22
    .line 23
    iget-object v5, v5, Lvp2;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v5, v4}, Lhl6;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0, v0, v2}, Lk57;->u0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    move-object v3, v0

    .line 36
    :cond_0
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v1, v3

    .line 40
    :goto_0
    return-object v1

    .line 41
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v5, Ln27;->m:Lup2;

    .line 47
    .line 48
    iget-object v5, v5, Lup2;->a:Lvp2;

    .line 49
    .line 50
    iget-object v5, v5, Lvp2;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v5, v4}, Lhl6;->o(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p0, v0, v2}, Lk57;->u0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    :cond_2
    if-nez v3, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move-object v1, v3

    .line 67
    :goto_1
    return-object v1

    .line 68
    :pswitch_1
    sget-object v0, Lyq5;->g:Lk26;

    .line 69
    .line 70
    invoke-static {v0, p0}, Lk26;->b(Lk26;Ljava/lang/CharSequence;)Lcv2;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object v0, Ljo3;->Y:Ljo3;

    .line 75
    .line 76
    new-instance v1, Lwl7;

    .line 77
    .line 78
    invoke-direct {v1, p0, v0}, Lwl7;-><init>(Lal6;Lvr2;)V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :pswitch_2
    sget-object v0, Lyq5;->e:Lk26;

    .line 83
    .line 84
    invoke-static {v0, p0}, Lk26;->b(Lk26;Ljava/lang/CharSequence;)Lcv2;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object v0, Ljo3;->X:Ljo3;

    .line 89
    .line 90
    new-instance v1, Lwl7;

    .line 91
    .line 92
    invoke-direct {v1, p0, v0}, Lwl7;-><init>(Lal6;Lvr2;)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
