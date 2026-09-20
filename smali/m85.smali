.class public final Lm85;
.super Ln85;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final l:Ll96;

.field public final m:Leh;


# direct methods
.method public constructor <init>(Ll96;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ln85;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lm85;->l:Ll96;

    .line 6
    .line 7
    invoke-static {p1}, Lp25;->t(Ll96;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lgh;->a()Leh;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1}, Leh;->c(Leh;Ll96;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-object v0, p0, Lm85;->m:Leh;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lm85;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lm85;

    .line 10
    .line 11
    iget-object p1, p1, Lm85;->l:Ll96;

    .line 12
    .line 13
    iget-object p0, p0, Lm85;->l:Ll96;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ll96;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final f()Lly5;
    .locals 4

    .line 1
    new-instance v0, Lly5;

    .line 2
    .line 3
    iget-object p0, p0, Lm85;->l:Ll96;

    .line 4
    .line 5
    iget v1, p0, Ll96;->a:F

    .line 6
    .line 7
    iget v2, p0, Ll96;->b:F

    .line 8
    .line 9
    iget v3, p0, Ll96;->c:F

    .line 10
    .line 11
    iget p0, p0, Ll96;->d:F

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, p0}, Lly5;-><init>(FFFF)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lm85;->l:Ll96;

    .line 2
    .line 3
    invoke-virtual {p0}, Ll96;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
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
.end method
