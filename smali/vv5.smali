.class public final synthetic Lvv5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La37;

.field public final synthetic y:La37;


# direct methods
.method public synthetic constructor <init>(La37;La37;I)V
    .locals 0

    .line 1
    iput p3, p0, Lvv5;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lvv5;->x:La37;

    .line 4
    .line 5
    iput-object p2, p0, Lvv5;->y:La37;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lvv5;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object v2, p0, Lvv5;->y:La37;

    .line 6
    .line 7
    iget-object p0, p0, Lvv5;->x:La37;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ll76;

    .line 13
    .line 14
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, Ll76;->l(F)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {p1, p0}, Ll76;->m(F)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {p1, p0}, Ll76;->c(F)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_0
    move-object v3, p1

    .line 55
    check-cast v3, Lhz1;

    .line 56
    .line 57
    const/high16 p1, 0x40000000    # 2.0f

    .line 58
    .line 59
    invoke-interface {v3, p1}, Ltp1;->e0(F)F

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljt0;

    .line 68
    .line 69
    iget-wide v10, v0, Ljt0;->a:J

    .line 70
    .line 71
    sget v0, Lkl8;->p:F

    .line 72
    .line 73
    div-float/2addr v0, p1

    .line 74
    invoke-interface {v3, v0}, Ltp1;->e0(F)F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    div-float p1, v5, p1

    .line 79
    .line 80
    sub-float/2addr v0, p1

    .line 81
    new-instance v4, Ll57;

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/16 v9, 0x1e

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-direct/range {v4 .. v9}, Ll57;-><init>(FFIII)V

    .line 89
    .line 90
    .line 91
    move-wide v5, v10

    .line 92
    const/16 v10, 0x6c

    .line 93
    .line 94
    const-wide/16 v7, 0x0

    .line 95
    .line 96
    move-object v9, v4

    .line 97
    move-wide v4, v5

    .line 98
    move v6, v0

    .line 99
    invoke-static/range {v3 .. v10}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Llx1;

    .line 107
    .line 108
    iget v0, v0, Llx1;->w:F

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-static {v0, v4}, Llx1;->a(FF)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-lez v0, :cond_0

    .line 116
    .line 117
    invoke-interface {p0}, La37;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljt0;

    .line 122
    .line 123
    iget-wide v4, p0, Ljt0;->a:J

    .line 124
    .line 125
    invoke-interface {v2}, La37;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, Llx1;

    .line 130
    .line 131
    iget p0, p0, Llx1;->w:F

    .line 132
    .line 133
    invoke-interface {v3, p0}, Ltp1;->e0(F)F

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    sub-float/2addr p0, p1

    .line 138
    sget-object v8, Lrd2;->a:Lrd2;

    .line 139
    .line 140
    const/16 v9, 0x6c

    .line 141
    .line 142
    const-wide/16 v6, 0x0

    .line 143
    .line 144
    move-object v2, v3

    .line 145
    move-wide v3, v4

    .line 146
    move v5, p0

    .line 147
    invoke-static/range {v2 .. v9}, Lhz1;->k0(Lhz1;JFJLiz1;I)V

    .line 148
    .line 149
    .line 150
    :cond_0
    return-object v1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
