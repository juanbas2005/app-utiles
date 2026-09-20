.class public final synthetic Lj30;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 12
    iput p1, p0, Lj30;->w:I

    iput-object p2, p0, Lj30;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lj30;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLsr2;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lj30;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Lj30;->x:Z

    .line 8
    .line 9
    iput-object p2, p0, Lj30;->y:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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
    .locals 4

    .line 1
    iget v0, p0, Lj30;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-boolean v2, p0, Lj30;->x:Z

    .line 6
    .line 7
    iget-object p0, p0, Lj30;->y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lmx0;

    .line 13
    .line 14
    check-cast p1, La64;

    .line 15
    .line 16
    invoke-virtual {p0, v2}, Lmx0;->s(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ll30;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p1, p0, v1}, Ll30;-><init>(La64;Lf1;I)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    check-cast p0, Lsr2;

    .line 27
    .line 28
    check-cast p1, Ll76;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const/high16 p0, 0x3f800000    # 1.0f

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_0
    invoke-virtual {p1, p0}, Ll76;->c(F)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :pswitch_1
    check-cast p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/Byte;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sget-object v3, Lss0;->a:Ljava/util/Set;

    .line 58
    .line 59
    invoke-interface {v3, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    sget-object v3, Lss0;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-eqz v2, :cond_2

    .line 75
    .line 76
    const/16 p1, 0x20

    .line 77
    .line 78
    if-ne v0, p1, :cond_2

    .line 79
    .line 80
    const/16 p1, 0x2b

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    invoke-static {v0}, Lss0;->g(B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    :goto_1
    int-to-char p1, v0

    .line 95
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    :goto_2
    return-object v1

    .line 99
    :pswitch_2
    check-cast p0, Lax0;

    .line 100
    .line 101
    check-cast p1, La64;

    .line 102
    .line 103
    iget-object v0, p0, Lf1;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lg30;

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Lg30;->e(Z)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lf30;

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ltv4;->i(Z)V

    .line 115
    .line 116
    .line 117
    new-instance v0, Ll30;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-direct {v0, p1, p0, v1}, Ll30;-><init>(La64;Lf1;I)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
