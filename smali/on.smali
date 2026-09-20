.class public final synthetic Lon;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhs2;


# direct methods
.method public synthetic constructor <init>(Lhs2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lon;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lon;->x:Lhs2;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lon;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    sget-object v5, Lga6;->a:Lga6;

    .line 9
    .line 10
    iget-object p0, p0, Lon;->x:Lhs2;

    .line 11
    .line 12
    check-cast p1, Lyt2;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v4

    .line 30
    :goto_0
    and-int/2addr p2, v3

    .line 31
    invoke-virtual {p1, p2, v0}, Lyt2;->V(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {p0, v5, p1, p2}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-object v1

    .line 49
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 50
    .line 51
    if-eq v0, v2, :cond_2

    .line 52
    .line 53
    move v4, v3

    .line 54
    :cond_2
    and-int/2addr p2, v3

    .line 55
    invoke-virtual {p1, p2, v4}, Lyt2;->V(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    sget-object p2, Lxb4;->I:Lh80;

    .line 62
    .line 63
    const/16 v0, 0x36

    .line 64
    .line 65
    sget-object v2, Lwr;->b:Lrr;

    .line 66
    .line 67
    invoke-static {v2, p2, p1, v0}, Lca6;->a(Ltr;Lh80;Lyt2;I)Lea6;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget-wide v6, p1, Lyt2;->T:J

    .line 72
    .line 73
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p1}, Lyt2;->m()Lvf5;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v4, Ljl4;->w:Ljl4;

    .line 82
    .line 83
    invoke-static {p1, v4}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    sget-object v6, Lux0;->d:Ltx0;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v6, Ltx0;->b:Lvy0;

    .line 93
    .line 94
    invoke-virtual {p1}, Lyt2;->i0()V

    .line 95
    .line 96
    .line 97
    iget-boolean v7, p1, Lyt2;->S:Z

    .line 98
    .line 99
    if-eqz v7, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1, v6}, Lyt2;->l(Lsr2;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-virtual {p1}, Lyt2;->r0()V

    .line 106
    .line 107
    .line 108
    :goto_2
    sget-object v6, Ltx0;->f:Lck;

    .line 109
    .line 110
    invoke-static {v6, p1, p2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p2, Ltx0;->e:Lck;

    .line 114
    .line 115
    invoke-static {p2, p1, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    sget-object v0, Ltx0;->g:Lck;

    .line 123
    .line 124
    invoke-static {v0, p1, p2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    sget-object p2, Ltx0;->h:Lce;

    .line 128
    .line 129
    invoke-static {p1, p2}, Lg75;->O(Lyt2;Lvr2;)V

    .line 130
    .line 131
    .line 132
    sget-object p2, Ltx0;->d:Lck;

    .line 133
    .line 134
    invoke-static {p2, p1, v4}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const/4 p2, 0x6

    .line 138
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-interface {p0, v5, p1, p2}, Lhs2;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v3}, Lyt2;->r(Z)V

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {p1}, Lyt2;->Y()V

    .line 150
    .line 151
    .line 152
    :goto_3
    return-object v1

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
